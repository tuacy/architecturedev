package com.tuacy.protocols.bean.response;

import java.util.List;

public class CityResponse {

	private List<CityResponse.HeWeather6> HeWeather6;

	public List<CityResponse.HeWeather6> getHeWeather6() {
		return HeWeather6;
	}

	public void setHeWeather6(List<CityResponse.HeWeather6> HeWeather6) {
		this.HeWeather6 = HeWeather6;
	}

	public static class HeWeather6 {

		/**
		 * basic : [{"cid":"CN101240501","location":"宜春","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"27.80430031","lon":"114.39113617","tz":"+8.00","type":"city"},{"cid":"CN101240505","location":"上高","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.23478889","lon":"114.93265533","tz":"+8.00","type":"city"},{"cid":"CN101240510","location":"丰城","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.19158363","lon":"115.78600311","tz":"+8.00","type":"city"},{"cid":"CN101240508","location":"高安","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.42095184","lon":"115.38153076","tz":"+8.00","type":"city"},{"cid":"CN101240511","location":"袁州","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"27.80011749","lon":"114.38738251","tz":"+8.00","type":"city"},{"cid":"CN101240502","location":"铜鼓","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.52095604","lon":"114.37014008","tz":"+8.00","type":"city"},{"cid":"CN101240509","location":"樟树","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.05589867","lon":"115.54338837","tz":"+8.00","type":"city"},{"cid":"CN101240503","location":"宜丰","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.3882885","lon":"114.78738403","tz":"+8.00","type":"city"},{"cid":"CN101240507","location":"奉新","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.70067215","lon":"115.38990021","tz":"+8.00","type":"city"},{"cid":"CN101240506","location":"靖安","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.86054039","lon":"115.36174774","tz":"+8.00","type":"city"}]
		 * status : ok
		 */

		private String         status;
		private List<CityItem> basic;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<CityItem> getBasic() {
			return basic;
		}

		public void setBasic(List<CityItem> basic) {
			this.basic = basic;
		}

		public static class CityItem {

			/**
			 * cid : CN101240501
			 * location : 宜春
			 * parent_city : 宜春
			 * admin_area : 江西
			 * cnty : 中国
			 * lat : 27.80430031
			 * lon : 114.39113617
			 * tz : +8.00
			 * type : city
			 */

			private String cid;
			private String location;
			private String parent_city;
			private String admin_area;
			private String cnty;
			private String lat;
			private String lon;
			private String tz;
			private String type;

			public String getCid() {
				return cid;
			}

			public void setCid(String cid) {
				this.cid = cid;
			}

			public String getLocation() {
				return location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getParent_city() {
				return parent_city;
			}

			public void setParent_city(String parent_city) {
				this.parent_city = parent_city;
			}

			public String getAdmin_area() {
				return admin_area;
			}

			public void setAdmin_area(String admin_area) {
				this.admin_area = admin_area;
			}

			public String getCnty() {
				return cnty;
			}

			public void setCnty(String cnty) {
				this.cnty = cnty;
			}

			public String getLat() {
				return lat;
			}

			public void setLat(String lat) {
				this.lat = lat;
			}

			public String getLon() {
				return lon;
			}

			public void setLon(String lon) {
				this.lon = lon;
			}

			public String getTz() {
				return tz;
			}

			public void setTz(String tz) {
				this.tz = tz;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			@Override
			public String toString() {
				return "CityItem{" + "cid='" + cid + '\'' + ", location='" + location + '\'' + ", parent_city='" + parent_city + '\'' +
					   ", admin_area='" + admin_area + '\'' + ", cnty='" + cnty + '\'' + ", lat='" + lat + '\'' + ", lon='" + lon + '\'' +
					   ", tz='" + tz + '\'' + ", type='" + type + '\'' + '}';
			}
		}
	}
}
