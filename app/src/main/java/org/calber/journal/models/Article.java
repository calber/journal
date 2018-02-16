
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("date_modified")
    @Expose
    public String dateModified;
    @SerializedName("date_published")
    @Expose
    public String datePublished;
    @SerializedName("is_updated")
    @Expose
    public Boolean isUpdated;
    @SerializedName("has_audio")
    @Expose
    public String hasAudio;
    @SerializedName("has_video")
    @Expose
    public String hasVideo;
    @SerializedName("has_slideshow")
    @Expose
    public String hasSlideshow;
    @SerializedName("is_hot_on_twitter")
    @Expose
    public String isHotOnTwitter;
    @SerializedName("publication")
    @Expose
    public String publication;
    @SerializedName("stats")
    @Expose
    public Stats stats;
    @SerializedName("syndication_source")
    @Expose
    public String syndicationSource;
    @SerializedName("seo_title")
    @Expose
    public Object seoTitle;
    @SerializedName("seo_description")
    @Expose
    public Object seoDescription;
    @SerializedName("is_sponsored")
    @Expose
    public Integer isSponsored;
    @SerializedName("sticky")
    @Expose
    public Object sticky;
    @SerializedName("header_url")
    @Expose
    public Object headerUrl;
    @SerializedName("internal_syndication_id")
    @Expose
    public Object internalSyndicationId;
    @SerializedName("digest_key")
    @Expose
    public String digestKey;
    @SerializedName("date_unix")
    @Expose
    public Integer dateUnix;
    @SerializedName("date_modified_unix")
    @Expose
    public Integer dateModifiedUnix;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("is_exclusive")
    @Expose
    public String isExclusive;
    @SerializedName("excerpt")
    @Expose
    public String excerpt;
    @SerializedName("content")
    @Expose
    public String content;
    @SerializedName("permalink")
    @Expose
    public String permalink;
    @SerializedName("shortlink")
    @Expose
    public String shortlink;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("is_short_post")
    @Expose
    public Boolean isShortPost;
    @SerializedName("image_data")
    @Expose
    public ImageData imageData;
    @SerializedName("show_image")
    @Expose
    public Boolean showImage;
    @SerializedName("slideshows")
    @Expose
    public Boolean slideshows;
    @SerializedName("poll")
    @Expose
    public Boolean poll;
    @SerializedName("by_line_author")
    @Expose
    public Boolean byLineAuthor;
    @SerializedName("has_liveblog")
    @Expose
    public Integer hasLiveblog;
    @SerializedName("has_active_liveblog")
    @Expose
    public Integer hasActiveLiveblog;
    @SerializedName("liveblog")
    @Expose
    public List<Object> liveblog = null;
    @SerializedName("primary_tag")
    @Expose
    public PrimaryTag primaryTag;
    @SerializedName("tags")
    @Expose
    public List<Tag> tags = null;
    @SerializedName("embeds")
    @Expose
    public Embeds embeds;
    @SerializedName("inline_images")
    @Expose
    public List<InlineImage> inlineImages = null;
    @SerializedName("comments_allowed")
    @Expose
    public Integer commentsAllowed;
    @SerializedName("river_format")
    @Expose
    public String riverFormat;
    @SerializedName("author")
    @Expose
    public Author author;
    @SerializedName("admin_author")
    @Expose
    public AdminAuthor adminAuthor;
    @SerializedName("banner_video")
    @Expose
    public BannerVideo bannerVideo;
    @SerializedName("advertising")
    @Expose
    public Advertising advertising;
    @SerializedName("retargeting")
    @Expose
    public List<Retargeting> retargeting = null;
    @SerializedName("id_name")
    @Expose
    public String idName;
    @SerializedName("primary_image")
    @Expose
    public PrimaryImage primaryImage;
    @SerializedName("time_label")
    @Expose
    public TimeLabel timeLabel;

}
