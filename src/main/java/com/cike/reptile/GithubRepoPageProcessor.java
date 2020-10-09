package com.cike.reptile;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * @Author Kou
 * @Date 2020/8/4
 * @Version 1.0
 **/
public class GithubRepoPageProcessor implements PageProcessor {

    private Site site = Site.me().setDomain("my.oschina.net");

    @Override
    public void process(Page page) {
        List<String> links = page.getHtml().links().regex("https://xueqiu.com/hq#exchange=CN").all();
        page.addTargetRequests(links);
        page.putField("content", page.getHtml().$("div.content").toString());
    }

    @Override
    public Site getSite() {
        return site;

    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).addUrl("https://xueqiu.com/hq#exchange=CN")
                .addPipeline(new ConsolePipeline()).run();
    }
}
