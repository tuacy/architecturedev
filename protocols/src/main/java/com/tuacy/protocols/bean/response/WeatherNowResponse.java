package com.tuacy.protocols.bean.response;

import java.util.List;

public class WeatherNowResponse {

	private List<WeatherNowResponse.HeWeather6> HeWeather6;

	public List<WeatherNowResponse.HeWeather6> getHeWeather6() {
		return HeWeather6;
	}

	public void setHeWeather6(List<WeatherNowResponse.HeWeather6> HeWeather6) {
		this.HeWeather6 = HeWeather6;
	}

	public static class HeWeather6 {

		/**
		 * basic : {"cid":"CN101240508","location":"高安","parent_city":"宜春","admin_area":"江西","cnty":"中国","lat":"28.42095184","lon":"115.38153076","tz":"+8.00"}
		 * update : {"loc":"2018-05-03 10:47","utc":"2018-05-03 02:47"}
		 * status : ok
		 * now : {"cloud":"49","cond_code":"104","cond_txt":"阴","fl":"22","hum":"48","pcpn":"0.0","pres":"1020","tmp":"23","vis":"20","wind_deg":"21","wind_dir":"东北风","wind_sc":"2","wind_spd":"8"}
		 */

		private BasicBean      basic;
		private UpdateBean     update;
		private String         status;
		private WeatherNowInfo now;

		public BasicBean getBasic() {
			return basic;
		}

		public void setBasic(BasicBean basic) {
			this.basic = basic;
		}

		public UpdateBean getUpdate() {
			return update;
		}

		public void setUpdate(UpdateBean update) {
			this.update = update;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public WeatherNowInfo getNow() {
			return now;
		}

		public void setNow(WeatherNowInfo now) {
			this.now = now;
		}

		public static class BasicBean {

			/**
			 * cid : CN101240508
			 * location : 高安
			 * parent_city : 宜春
			 * admin_area : 江西
			 * cnty : 中国
			 * lat : 28.42095184
			 * lon : 115.38153076
			 * tz : +8.00
			 */

			private String cid;
			private String location;
			private String parent_city;
			private String admin_area;
			private String cnty;
			private String lat;
			private String lon;
			private String tz;

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
		}

		public static class UpdateBean {

			/**
			 * loc : 2018-05-03 10:47
			 * utc : 2018-05-03 02:47
			 */

			private String loc;
			private String utc;

			public String getLoc() {
				return loc;
			}

			public void setLoc(String loc) {
				this.loc = loc;
			}

			public String getUtc() {
				return utc;
			}

			public void setUtc(String utc) {
				this.utc = utc;
			}
		}

		public static class WeatherNowInfo {

			/**
			 * cloud : 49
			 * cond_code : 104
			 * cond_txt : 阴
			 * fl : 22
			 * hum : 48
			 * pcpn : 0.0
			 * pres : 1020
			 * tmp : 23
			 * vis : 20
			 * wind_deg : 21
			 * wind_dir : 东北风
			 * wind_sc : 2
			 * wind_spd : 8
			 */

			private String cloud;
			private String cond_code;
			private String cond_txt;
			private String fl;
			private String hum;
			private String pcpn;
			private String pres;
			private String tmp;
			private String vis;
			private String wind_deg;
			private String wind_dir;
			private String wind_sc;
			private String wind_spd;

			public String getCloud() {
				return cloud;
			}

			public void setCloud(String cloud) {
				this.cloud = cloud;
			}

			public String getCond_code() {
				return cond_code;
			}

			public void setCond_code(String cond_code) {
				this.cond_code = cond_code;
			}

			public String getCond_txt() {
				return cond_txt;
			}

			public void setCond_txt(String cond_txt) {
				this.cond_txt = cond_txt;
			}

			public String getFl() {
				return fl;
			}

			public void setFl(String fl) {
				this.fl = fl;
			}

			public String getHum() {
				return hum;
			}

			public void setHum(String hum) {
				this.hum = hum;
			}

			public String getPcpn() {
				return pcpn;
			}

			public void setPcpn(String pcpn) {
				this.pcpn = pcpn;
			}

			public String getPres() {
				return pres;
			}

			public void setPres(String pres) {
				this.pres = pres;
			}

			public String getTmp() {
				return tmp;
			}

			public void setTmp(String tmp) {
				this.tmp = tmp;
			}

			public String getVis() {
				return vis;
			}

			public void setVis(String vis) {
				this.vis = vis;
			}

			public String getWind_deg() {
				return wind_deg;
			}

			public void setWind_deg(String wind_deg) {
				this.wind_deg = wind_deg;
			}

			public String getWind_dir() {
				return wind_dir;
			}

			public void setWind_dir(String wind_dir) {
				this.wind_dir = wind_dir;
			}

			public String getWind_sc() {
				return wind_sc;
			}

			public void setWind_sc(String wind_sc) {
				this.wind_sc = wind_sc;
			}

			public String getWind_spd() {
				return wind_spd;
			}

			public void setWind_spd(String wind_spd) {
				this.wind_spd = wind_spd;
			}

			@Override
			public String toString() {
				return "WeatherNowInfo{" + "cloud='" + cloud + '\'' + ", cond_code='" + cond_code + '\'' + ", cond_txt='" + cond_txt +
					   '\'' + ", fl='" + fl + '\'' + ", hum='" + hum + '\'' + ", pcpn='" + pcpn + '\'' + ", pres='" + pres + '\'' +
					   ", tmp='" + tmp + '\'' + ", vis='" + vis + '\'' + ", wind_deg='" + wind_deg + '\'' + ", wind_dir='" + wind_dir +
					   '\'' + ", wind_sc='" + wind_sc + '\'' + ", wind_spd='" + wind_spd + '\'' + '}';
			}
		}
	}
}
