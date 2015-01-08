package com.example.provinceandcityforcn.process;

import com.example.provinceandcityforcn.model.Meg;
import com.example.provinceandcityforcn.model.Pic;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by wxm on 2015/1/8 in PC
 */
public class ProcessResult {
    /**
     * 返回key-Value对应形式URL<br>
     *     "video":{"http://@@@.mp4",}<br>
     *     "pics":{"http://@@@.jpg","http://@@@.png","http://@@@.bmp"}<br>
     *     "web":{"http://@@@.html",}<br>
     *
     * @param arrary 解析到的XML封装结构
     */
    public HashMap<String, String[]> process(ArrayList<Object> arrary) {
        HashMap<String, String[]> hashMaps=new HashMap<String, String[]>();
        int lenght = arrary.size();
        for (int i = 0; i < lenght; i++) {
            ArrayList<Object> content;
            content = (ArrayList<Object>)arrary.get(i);
            Meg meg=(Meg)content.get(0);
            if(meg.getType().equals("video")){
                String []strs={meg.getVideoUrl(),};
                hashMaps.put("video",strs);
            }else if(meg.getType().equals("pic")){
                ArrayList<Pic> picArrary=(ArrayList<Pic>)content.get(1);
                int picLength=picArrary.size();
                String strs[]=new String[picLength];
                for(int j=0;j<picLength;j++){
                    Pic pic=picArrary.get(j);
                    strs[j]=pic.getPicUrl();
                }
                hashMaps.put("pics",strs);
            }else if(meg.getType().equals("web")){
                String []strs={meg.getWebUrl(),};
                hashMaps.put("web",strs);
            }
        }
        return hashMaps;
    }
}
