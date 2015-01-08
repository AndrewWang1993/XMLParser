package com.example.provinceandcityforcn.paser;

import android.util.Log;

import com.example.provinceandcityforcn.City;
import com.example.provinceandcityforcn.model.Meg;
import com.example.provinceandcityforcn.model.Pic;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * Created by wangxm-wr on 2015/1/8 in Vanke.
 */

public class MediaParser {

    public static ArrayList<Object> ParseXml(XmlPullParser parser) {
        ArrayList<Object> arrarys = new ArrayList<Object>();
        ArrayList<Object> content =new ArrayList<Object>();
        ArrayList<Pic> picArrary = new ArrayList<Pic>();
        Meg meg = null;
        String type;
        String videoUrl;
        String webUrl;
        String descri;
        Pic pic = null;
        String picUrl;
        String name;
        String id;

        try {
            int eventType = parser.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        String tagNameStart = parser.getName();
                        if (tagNameStart.equals("Message")) {
                            content =new ArrayList<Object>();
                            parser.next();
                            meg = new Meg();
                            type = parser.nextText();
                            parser.next();
                            videoUrl = parser.nextText();
                            parser.next();
                            webUrl = parser.nextText();
                            parser.next();
                            descri = parser.nextText();

                            meg.setType(type);
                            meg.setVideoUrl(videoUrl);
                            meg.setWebUrl(webUrl);
                            meg.setDescri(descri);
                        } else if (tagNameStart.equals("Pics")) {
                            picArrary = new ArrayList<Pic>();
                        } else if (tagNameStart.equals("Pic")) {
                            parser.next();
                            pic = new Pic();
                            picUrl = parser.nextText();
                            parser.next();
                            name = parser.nextText();
                            parser.next();
                            id = parser.nextText();

                            pic.setPicUrl(picUrl);
                            pic.setName(name);
                            pic.setId(id);
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        String tagNameEnd = parser.getName();

                        if (tagNameEnd.equals("Pic")) {
                            picArrary.add(pic);
                        } else if (tagNameEnd.equals("Pics")) {
                        } else if (tagNameEnd.equals("Message")) {
                            content.add(meg);
                            content.add(picArrary);
                            arrarys.add(content);
                        }
                        break;
                    case XmlPullParser.END_DOCUMENT:
                        break;
                }

                //��������next����������һ���¼������˵Ľ���ͳ���ѭ��#_#
                eventType = parser.next();
            }
        } catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return arrarys;
    }


//    public static ArrayList<ArrayList<Pic>> ParseXml(XmlPullParser parser) {
//        ArrayList<ArrayList<Pic>> PicArrarys = new ArrayList<ArrayList<Pic>>();
//        ArrayList<Pic> picArrary = new ArrayList<Pic>();
//        Pic pic = null;
//        String picUrl;
//        String name;
//        String id;
//
//        try {
//            //��ʼ�����¼�
//            int eventType = parser.getEventType();
//
//            //�����¼����������ĵ�������һֱ����
//            while (eventType != XmlPullParser.END_DOCUMENT) {
//                //��Ϊ������һ�Ѿ�̬�������������������switch
//                switch (eventType) {
//                    case XmlPullParser.START_DOCUMENT:
//                        break;
//
//                    case XmlPullParser.START_TAG:
//                        String tagNameStart = parser.getName();
//                        if (tagNameStart.equals("Pics")) {
//                            picArrary=new ArrayList<Pic>();
//                        } else if (tagNameStart.equals("Pic")) {
//                            parser.next();
//                            pic=new Pic();
//                            picUrl = parser.nextText();
//                            parser.next();
//                            name=parser.nextText();
//                            parser.next();
//                            id=parser.nextText();
//
//                            pic.setPicUrl(picUrl);
//                            pic.setName(name);
//                            pic.setId(id);
//                        } else if (tagNameStart.equals("ddd")) {
//
//                        }
//                        break;
//
//                    case XmlPullParser.END_TAG:
//                        String tagNameEnd = parser.getName();
//                        if(tagNameEnd.equals("Pic")) {
//                            picArrary.add(pic);
//                        }else if(tagNameEnd.equals("Pics")){
//                            PicArrarys.add(picArrary);
//                        }
//                        break;
//                    case XmlPullParser.END_DOCUMENT:
//                        break;
//                }
//
//                //��������next����������һ���¼������˵Ľ���ͳ���ѭ��#_#
//                eventType = parser.next();
//            }
//        } catch (XmlPullParserException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return PicArrarys;
//    }


}
