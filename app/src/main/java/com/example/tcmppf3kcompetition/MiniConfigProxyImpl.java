package com.example.tcmppf3kcompetition;

import android.app.Application;

import com.tencent.tmf.mini.api.bean.MiniInitConfig;
import com.tencent.tmf.mini.api.proxy.MiniConfigProxy;
import com.tencent.tmfmini.sdk.annotation.ProxyService;

@ProxyService(proxy = MiniConfigProxy.class)
public class MiniConfigProxyImpl extends MiniConfigProxy {
    /**
     * 应用Application
     * 注：该方法主进程和小程序进程都会调用，因此主进程和子进程都要返回应      * 用Application
     * @return
     */

    @Override
    public Application getApp() {

        return F3KCompetitionApp.getApp();
    }

    /**
     * 创建初始化配置信息
     * 注：该方法主进程和小程序进程都会调用，因此主进程和子进程都能返回      * 配置信息
     * @return
     */
    @Override
    public MiniInitConfig buildConfig() {
        MiniInitConfig.Builder builder = new MiniInitConfig.Builder();
        MiniInitConfig config = builder
                .configAssetName("tcmpp-android-configurations.json")//assets中配置文件名称
                .imei("IMEI")////配置设备id，⽤于在管理平台上根据设备标识进⾏⼩程序的灰度发布使⽤(可选)
                .debug(true)//日志开关，默认关闭的
                .build();

        return config;
    }
}