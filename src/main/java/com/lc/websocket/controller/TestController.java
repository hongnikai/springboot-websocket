package com.lc.websocket.controller;

import com.lc.websocket.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/testController")
@SuppressWarnings("all")
public class TestController {

    @Autowired
    private UserService userService;

    String uploadUrl="https://target.my.com/api/v2/campaigns/mass_action.json";

    @RequestMapping("/test")
    public Object test(){
        return userService.selectAllUser();
    }

    @RequestMapping("/testData")
    public String testData(){
        return "sssss";
    }

    @RequestMapping(value="/postTest",method= RequestMethod.POST)
    public Object  postTest(HttpServletRequest request ) throws IOException {
        String result="";
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> fileList = multipartRequest.getFiles("file");
        MultipartFile file = fileList.get(0);
        // 换行符
        final String newLine = "\r\n";
        final String boundaryPrefix = "--";
        // 定义数据分隔线
        String BOUNDARY = "========7d4a6d158c9";
        // 服务器的域名
        URL url = new URL(uploadUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 设置为POST情
        conn.setRequestMethod("POST");
        // 发送POST请求必须设置如下两行
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        // 设置请求头参数
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("Charset", "UTF-8");
        conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);

        OutputStream out = new DataOutputStream(conn.getOutputStream());

        // 上传文件

        StringBuilder sb = new StringBuilder();
        sb.append(boundaryPrefix);
        sb.append(BOUNDARY);
        sb.append(newLine);
        // 文件参数,photo参数名可以随意修改
        sb.append("Content-Disposition: form-data;name=\"photo\";filename=\"" + file.getOriginalFilename()
                + "\"" + newLine);
        sb.append("Content-Type:application/octet-stream");
        // 参数头设置完以后需要两个换行，然后才是参数内容
        sb.append(newLine);
        sb.append(newLine);

        // 将参数头的数据写入到输出流中
        out.write(sb.toString().getBytes());

        // 数据输入流,用于读取文件数据
        DataInputStream in = new DataInputStream(file.getInputStream());
        byte[] bufferOut = new byte[1024*8];
        int bytes = 0;
        // 每次读8KB数据,并且将文件数据写入到输出流中
        while ((bytes = in.read(bufferOut)) != -1) {
            out.write(bufferOut, 0, bytes);
        }
        // 最后添加换行
        out.write(newLine.getBytes());
        in.close();

        // 定义最后数据分隔线，即--加上BOUNDARY再加上--。
        byte[] end_data = (newLine + boundaryPrefix + BOUNDARY + boundaryPrefix + newLine)
                .getBytes();
        // 写上结尾标识
        out.write(end_data);
        out.flush();
        out.close();

        // 定义BufferedReader输入流来读取URL的响应

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
            result += line; //这里读取的是上边url对应的上传文件接口的返回值，读取出来后，然后接着返回到前端，实现接口中调用接口的方式
        }


        return "sss";

    }



}
