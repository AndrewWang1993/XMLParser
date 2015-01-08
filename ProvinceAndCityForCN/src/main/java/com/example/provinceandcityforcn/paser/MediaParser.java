//package com.example.provinceandcityforcn.paser;
//
//import android.util.Log;
//
//import com.example.provinceandcityforcn.City;
//import com.example.provinceandcityforcn.model.Pic;
//
//import org.xmlpull.v1.XmlPullParser;
//import org.xmlpull.v1.XmlPullParserException;
//import org.xmlpull.v1.XmlPullParserFactory;
//
//import java.io.IOException;
//import java.io.StringReader;
//import java.util.ArrayList;
//
///**
// * Created by wangxm-wr on 2015/1/8 in Vanke.
// */
//
//public class MediaParser {
//
//    public static ArrayList<City> ParseXml(XmlPullParser parser) {
//        ArrayList<ArrayList<Pic>> PicArrarys = new ArrayList<ArrayList<Pic>>();
//        ArrayList<Pic> picArrary = new ArrayList<Pic>();
//        Pic pic = null;
//        String PicUrl;
//        String Name;
//        String Id;
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
//                        String tagName = parser.getName();
//                        if (tagName.equals("Pics")) {
//                            picArrary=new ArrayList<Pic>();
//                            provinceId = Integer.parseInt(parser.getAttributeValue(0));
//                        } else if (tagName.equals("item")) {
//                            CityTemp = new City();
//                        } else if (tagName.equals("id")) {
//                            cityId = Integer.parseInt(parser.nextText());
//                            parser.next();
//                            cityName = parser.nextText();
//
//                            Log.v("", "id getText: " + cityId);
//                            Log.v("", "name getText: " + cityName);
//                            Log.e("", "=========================");
//
//                            if (CityTemp != null) {
//                                CityTemp.setProvinceId(provinceId);
//                            }
//                            if (CityTemp != null) {
//                                CityTemp.setCityId(cityId);
//                            }
//                            if (CityTemp != null) {
//                                CityTemp.setCityName(cityName);
//                            }
//
//                            CityArray.add(CityTemp);
//                        }
//                        break;
//
//                    case XmlPullParser.END_TAG:
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
//        return CityArray;
//    }
//
//}
