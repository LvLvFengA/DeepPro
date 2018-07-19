package com.lvfeng.tool.weather;



public class TestWeather {
	public static void main(String[] args) throws Exception{
		//城市列表，ak,sg,返回格式
		String res = WeatherAPI.getWeatherWeek("1", WeatherAPI.APP_KEY_WEATHER, WeatherAPI.SIGN_WEATHER, "json");
		System.out.println("结果集" + res);
		
		/* {
		 * "success":"1",
		 * "result":[{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-18",
		 * 		"week":"星期三",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"32℃/25℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云转小雨",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/7.gif",
		 * 		"wind":"东风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"32",
		 * 		"temp_low":"25",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"8",
		 * 		"windid":"10",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"7"
		 * 	},{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-19",
		 * 		"week":"星期四",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"33℃/26℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云转雷阵雨",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/4.gif",
		 * 		"wind":"南风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"33",
		 * 		"temp_low":"26",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"5",
		 * 		"windid":"5",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"4"
		 * },{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-20",
		 * 		"week":"星期五",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"34℃/27℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/1.gif",
		 * 		"wind":"西南风转南风",
		 * 		"winp":"3-4级转<3级",
		 * 		"temp_high":"34",
		 * 		"temp_low":"27",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"2",
		 * 		"windid":"73",
		 * 		"winpid":"402",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"1"
		 * },{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-21",
		 * 		"week":"星期六",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"34℃/27℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/1.gif",
		 * 		"wind":"南风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"34",
		 * 		"temp_low":"27",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"2",
		 * 		"windid":"5",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"1"
		 * },{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-22",
		 * 		"week":"星期日",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"34℃/26℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/1.gif",
		 * 		"wind":"南风转东北风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"34",
		 * 		"temp_low":"26",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"2",
		 * 		"windid":"36",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"1"
		 * },{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-23",
		 * 		"week":"星期一",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"33℃/25℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"晴",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/0.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/0.gif",
		 * 		"wind":"北风转东北风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"33",
		 * 		"temp_low":"25",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"1",
		 * 		"weatid1":"1",
		 * 		"windid":"39",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"0",
		 * 		"weather_iconid1":"0"
		 * },{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-24",
		 * 		"week":"星期二",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"33℃/25℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/1.gif",
		 * 		"wind":"东南风转东风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"33",
		 * 		"temp_low":"25",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"2",
		 * 		"windid":"21",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"1"
		 * }]}
		 */

	}
}