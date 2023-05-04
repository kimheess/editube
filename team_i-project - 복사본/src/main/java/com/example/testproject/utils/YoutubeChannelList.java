//package com.example.testproject.utils;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Data;
//import java.util.List;
//
//@Data
//public class YoutubeChannelList {
//    private String etag;
//    private List<Item> items;
//    private String kind;
//    private PageInfo pageInfo;
//
//    @Data
//    public static class Item {
//        private String etag;
//        private String id;
//        private String kind;
//        private ContentDetails contentDetails;
//        private Snippet snippet;
//        private Statistics statistics;
//
//        @Data
//        public static class ContentDetails {
//            private RelatedPlaylists relatedPlaylists;
//
//            @Data
//            public static class RelatedPlaylists {
//                private String likes;
//                private String uploads;
//            }
//        }
//
//        @Data
//        public static class Snippet {
//            private String customUrl;
//            private String description;
//            private Localized localized;
//            @JsonProperty("publishedAt")
//            private PublishedAt publishedAt;
//            private Thumbnails thumbnails;
//            private String title;
//
//            @Data
//            public static class Localized {
//                private String description;
//                private String title;
//            }
//
//            @Data
//            public static class PublishedAt {
//                private String value;
//                private boolean dateOnly;
//                private int timeZoneShift;
//
//                public PublishedAt(String value) {
//                    this.value = value;
//                }
//            }
//
//            @Data
//            @JsonIgnoreProperties(ignoreUnknown = true)
//            public static class Thumbnails {
//                private Default defaultThumbnail;
//                private High high;
//                private Medium medium;
//
//                @Data
//                public static class Default {
//                    private int height;
//                    private String url;
//                    private int width;
//                }
//
//                @Data
//                public static class High {
//                    private int height;
//                    private String url;
//                    private int width;
//                }
//
//                @Data
//                public static class Medium {
//                    private int height;
//                    private String url;
//                    private int width;
//                }
//            }
//        }
//
//        @Data
//        public static class Statistics {
//            private boolean hiddenSubscriberCount;
//            private int subscriberCount;
//            private int videoCount;
//            private int viewCount;
//        }
//    }
//
//    @Data
//    public static class PageInfo {
//        private int resultsPerPage;
//        private int totalResults;
//    }
//}