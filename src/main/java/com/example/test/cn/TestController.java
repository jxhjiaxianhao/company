package com.example.test.cn;

import com.alibaba.fastjson.JSONObject;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

@RestController
@RequestMapping("/exec")
public class TestController {


    @RequestMapping("/shell")
    public String execShell(@RequestParam(value = "batchNo" ) String batchNo) throws IOException {
        Process exec = Runtime.getRuntime().exec("/usr/local/lims/1.sh" + " \"" + batchNo + "\"");
        InputStream inputStream = exec.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    @RequestMapping("/file")
    public String file( @RequestBody MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        InputStream ip = file.getInputStream();
        BufferedReader bf =new BufferedReader(new InputStreamReader(ip,"UTF-8"));
        String s = bf.readLine();
        System.out.println(s);
        return s;
    }

    @GetMapping("/111")
    public String file()  {
        Son.i.set(Son.integer);
        Son.integer=89;
        System.out.println(Son.i.get());
        return null;
    }

}
