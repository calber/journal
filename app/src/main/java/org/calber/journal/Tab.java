package org.calber.journal;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.calber.journal.models.Article;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class Tab extends AppCompatActivity {
    @BindView(R.id.navigation)
    BottomNavigationView navigation;
    @BindView(R.id.list)
    RecyclerView list;

    private ApiController controller;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = item -> {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                controller.api.publication(JournalApi.PUBSTAG[0])
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(river -> list.setAdapter(new ArticlesAdapter(this, river.response.articles)),
                                throwable -> Log.e("JOURNAL", "", throwable));
                return true;
            case R.id.navigation_tag:
                controller.api.slug(JournalApi.SLUGSTAG[0])
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(river -> list.setAdapter(new ArticlesAdapter(this, river.response.articles)),
                                throwable -> Log.e("JOURNAL", "", throwable));
                return true;
        }
        return false;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        controller = new ApiController();

        ButterKnife.bind(this);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        list.setLayoutManager(lm);
        list.setHasFixedSize(true);

        controller.api.publication(JournalApi.PUBSTAG[0])
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(river -> list.setAdapter(new ArticlesAdapter(this, river.response.articles)),
                        throwable -> Log.e("JOURNAL", "", throwable));

    }

    private class ArticlesAdapter extends RecyclerView.Adapter<ViewHolder> {
        List<Article> articles;
        Context context;

        public ArticlesAdapter(Context c, List<Article> as) {

            as.removeIf(article -> !article.type.equals("post") && article.images.thumbnail == null);

            articles = as;
            context = c;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());

            View view = inflater.inflate(R.layout.article, parent, false);
            return new ViewHolder(view, viewType);
        }

        @Override
        public void onBindViewHolder(ViewHolder h, int position) {
            h.title.setText(articles.get(position).title);
            h.excerpt.setText(articles.get(position).excerpt);
            Picasso.with(context)
                    .load(articles.get(position).images.thumbnail.image)
                    .into(h.image);
        }


        @Override
        public int getItemCount() {
            return articles.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.excerpt)
        TextView excerpt;

        public ViewHolder(View itemView, int viewType) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }

}
