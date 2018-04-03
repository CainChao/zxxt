package com.zxxt.common.util;

public class Objects {
	
	public static boolean eq(Object oa, Object ob){
		if(oa == ob){
			return true;
		}
		if(oa == null || ob == null){
			return false;
		} else {
			return oa.equals(ob);
		}
	}
	
	public static boolean eqs(Object[] oas, Object[] obs){
		if(oas == obs){
			return true;
		}
		if(oas == null || obs == null){
			return false;
		}
		if(oas.length != obs.length){
			return false;
		} else {
			for(int i = 0; i < oas.length; i++){
				if(!eq(oas[i], obs[i])){
					return false;
				}
			}
			return true;
		}
	}
	
	public static String toStr(Object obj){
		if(obj == null){
			return "";
		}
		return obj.toString(); 
	}
}
