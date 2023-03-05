package com.andrew.song.controller;


import com.andrew.song.base.ResponseEntity;
import com.andrew.song.bean.VideoBean;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VideoDetailController {

    @RequestMapping("/videodetail")
    @ResponseBody
    public ResponseEntity<VideoBean> videoDetail(){
        VideoBean bean = new VideoBean("id", String.format("视频标题 请求头: brand=%s model=%s", "brand", "model"));
        System.out.println("videodetail" + bean.getTitle());
        return ResponseEntity.ofSuccess(bean);
    }
}