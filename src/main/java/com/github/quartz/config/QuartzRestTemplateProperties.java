package com.github.quartz.config;import org.springframework.boot.context.properties.ConfigurationProperties;import java.util.ArrayList;import java.util.List;/** * @DESCRIPTION: quartz请求参数配置类 * @AUTHER: chenmin * @CREATE BY: 18/1/13 下午4:54 */@ConfigurationProperties(prefix = "quartzTemplate", ignoreInvalidFields = true)public class QuartzRestTemplateProperties {    private Integer readTimeout = 10000;    private Integer connectTimeout = 10000;    private List<String> uris = new ArrayList<String>();    private String api;    public Integer getReadTimeout() {        return readTimeout;    }    public void setReadTimeout(Integer readTimeout) {        this.readTimeout = readTimeout;    }    public Integer getConnectTimeout() {        return connectTimeout;    }    public void setConnectTimeout(Integer connectTimeout) {        this.connectTimeout = connectTimeout;    }    public List<String> getUris() {        return uris;    }    public void setUris(List<String> uris) {        this.uris = uris;    }    public String getApi() {        return api;    }    public void setApi(String api) {        this.api = api;    }}