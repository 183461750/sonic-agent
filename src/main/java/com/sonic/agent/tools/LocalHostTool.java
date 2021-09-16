package com.sonic.agent.tools;

import java.net.InetAddress;

public class LocalHostTool {
    public static String host = "127.0.0.1";

    public static String getHostIp() {
        if (!host.equals("127.0.0.1")) {
            return host;
        }
        try {
            host = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return host;
    }
}