package com.madeofwu.will.utils;

import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author Andy
 *
 *         解析json数据
 */
public class JsonUtil {

	/**
	 * 根据data查询信息
	 *
	 * @return
	 */
	public static JSONArray getArray(String data) {
		// 获取数据
		JSONObject jsonObject = JSONObject.fromObject(data);
		return jsonObject.getJSONArray("data");
	}

	/**
	 * 根据key查询信息
	 *
	 * @return
	 */
	public static JSONArray getArray(String key, String data) {
		// 获取数据
		JSONObject jsonObject = JSONObject.fromObject(data);
		return jsonObject.getJSONArray(key);
	}

	/**
	 * 根据data查询信息
	 *
	 * @return
	 */
	public static JSONObject getObject(String data) {
		// 获取数据
		return JSONObject.fromObject(data);
	}

	/**
	 * 根据key查询信息
	 *
	 * @return
	 */
	public static JSONObject getObject(String key, String data) {
		// 获取数据
		return JSONObject.fromObject(data).getJSONObject(key);
	}

	/**
	 * 根据key查询信息
	 *
	 * @return
	 */
	public static Object getArrayByFastjson(String data) {
		// 获取数据
		com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSONObject
				.parseObject(data);
		return jsonObject.get("data");
	}

	/**
	 * 接口的json数据格式
	 * 
	 * @param isFlag
	 * @param map
	 * @return
	 */
	public static com.alibaba.fastjson.JSONObject toJsonByFastjson(
			boolean isFlag, Object obj) {
		com.alibaba.fastjson.JSONObject jsonResult = new com.alibaba.fastjson.JSONObject(); // new一个JSON
		jsonResult.put("result", isFlag);
		jsonResult.put("data", obj);
		return jsonResult;
	}

	/**
	 * 接口的json数据格式
	 * 
	 * @param isFlag
	 * @param map
	 * @return
	 */
	public static JSONObject toJson(boolean isFlag, Object obj) {
		JSONObject jsonResult = new JSONObject(); // new一个JSON
		jsonResult.put("result", isFlag);
		jsonResult.put("data", obj);
		return jsonResult;
	}

	/**
	 * 错误的接口json数据
	 * 
	 * @param errorCode
	 * @param errorMsg
	 * @return
	 */
	public static JSONObject toErrorJson(String errorCode, String errorMsg) {
		JSONObject jsonResult = new JSONObject(); // new一个JSON
		jsonResult.put("result", false);
		jsonResult.put("errorCode", errorCode);
		jsonResult.put("errorMsg", errorMsg);
		return jsonResult;
	}

	/**
	 * 错误的接口json数据
	 * 
	 * @param errorCode
	 * @param errorMsg
	 * @return
	 */
	public static com.alibaba.fastjson.JSONObject toErrorJsonByFastjson(
			String errorCode, String errorMsg) {
		com.alibaba.fastjson.JSONObject jsonResult = new com.alibaba.fastjson.JSONObject(); // new一个JSON
		jsonResult.put("result", false);
		jsonResult.put("errorCode", errorCode);
		jsonResult.put("errorMsg", errorMsg);
		return jsonResult;
	}

	/* --------------------- 处理web的json数据 ------------------------ */

	/**
	 * 处理多个数据的返回的json数据
	 * 
	 * @param obj
	 * @return { key: '', value: '' } //多个
	 */
	public static com.alibaba.fastjson.JSONObject toJson(Map<String, Object> obj) {
		// 获取数据信息
		com.alibaba.fastjson.JSONObject jsonResult = new com.alibaba.fastjson.JSONObject(); // new一个JSON
		for (Map.Entry<String, Object> entry : obj.entrySet()) {
			jsonResult.put(entry.getKey(), entry.getValue());
		}
		return jsonResult;
	}

	/**
	 * 处理单个数据的返回的json数据
	 * 
	 * @param key
	 * @param value
	 * @return { key: '', value: '' }
	 */
	public static com.alibaba.fastjson.JSONObject toJson(String key,
			Object value) {
		// 获取数据信息
		com.alibaba.fastjson.JSONObject jsonResult = new com.alibaba.fastjson.JSONObject(); // new一个JSON
		jsonResult.put(key, value);
		return jsonResult;
	}
	
	/**
	 * 处理单个数据的返回的json数据
	 * 
	 * @param key
	 * @param value
	 * @return { key: '', value: '' }
	 */
	public static com.alibaba.fastjson.JSONObject toJson(Object value) {
		// 获取数据信息
		com.alibaba.fastjson.JSONObject jsonResult = new com.alibaba.fastjson.JSONObject(); // new一个JSON
		jsonResult.put("data", value);
		return jsonResult;
	}

}
