package com.example.assingnment4443;

public class Input {

        private int imgApp;
        private String name;
        private String app_description;

        public Input(int imgapp, String name, String description) {
            this. imgApp =  imgapp;
            this.name = name;
            this.app_description = description;
        }

        public int getImgApp() {
            return  imgApp;
        }

        public void setImgApp(int imgApp) {
            this. imgApp=  imgApp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getApp_description() {
            return app_description;
        }

        public void setApp_description(String app_description) {
            this.app_description = app_description;
        }
    }

