package com.java.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoreMethods {

	public static void main(String[] args) {
/*		String[] arr= {"dsfd","fddsfds","dfdsrfds","dfsfsds"};
		
		//--------------------------------------replaceAll, removeIf------------------------------------
		List<String> wordList= new ArrayList( Arrays.asList(arr));
		//removeIf
				wordList.removeIf(t-> t.contains("r"));
				wordList.forEach(System.out::println);
				System.out.println(arr);
		
		wordList.replaceAll(new UnaryOperator<String>() {
			
			@Override
			public String apply(String t) {
				t=t.replace("s", "a");
				return t;
			}
		});
		//replaceAll iterates through list and perform operation on each
		wordList.replaceAll(t-> t.replace('s', 'a'));
		wordList.forEach(System.out::println);
		
		Map<String, String> map= new HashMap<>();
		map.put("sfdsf","retre");
		map.put("dfdsf", "sdfsd");
		
		map.replaceAll(new BiFunction<String, String, String>() {

			@Override
			public String apply(String key, String oldVal) {
			String	newVal= oldVal.replace("r", "s");
				return newVal;
			}
		});
		map.replaceAll((key, val)-> val.replace('r', 'a'));
		System.out.println(map);*/
		
		//----------------------------------------------------------singleton methods in Collections class------------------------------------
		
		/*List<String> list= Arrays.asList("sdfsd");
		Set<List<String>> list1=  Collections.singleton(list);
		//list1.add(Arrays.asList("sdfsdsdfs"));
		System.out.println(list1);
		
		
		List<String> list2= Arrays.asList("sdfsd");
		List<List<String>> list3=  Collections.singletonList(list2);
		//list2.add(Arrays.asList("sdfsdsdfs"));
		System.out.println(list3);
		
		List<String> list4= new ArrayList<>();
		list4.add("Dffdd");
		Map<String, List<String>> map=  Collections.singletonMap("dffdsd", list4);
		list4.add("dffds");
		 System.out.println(map);
			Map<String, String> map1=  Collections.singletonMap("dffdsd", "gdfg");
			System.out.println(map1);
			
			
			Map<String, List<String>> map2=  new HashMap<>();
			List<String> list5= new ArrayList<>();
			list5.add("gdfg");
			map2.put("dffdsd", list5);
			System.out.println(map2);
			//Any changes made to list would be made in map as well. 
			list5.add("gfhgfhgfh");
			System.out.println(map2);
			//Hence need for singleton collections.
*/			
			List<String> list6= Collections.EMPTY_LIST;
			System.out.println(list6);
			list6.add("dfdsfs");
			
			List<String> list7= new ArrayList<>();
			if(list6.equals(list7)){
				System.out.println("equal");
			}
			if(list6==list7){
				System.out.println("list6==list7");
			}
			List<String> list8= Collections.EMPTY_LIST;
			if(list6==list8){
				System.out.println("list6==list8");
			}
			
			List<String> list9= Collections.emptyList();
			if(list6==list9){
				System.out.println("list6==list9");
			}
			
			List<String> list10= Collections.emptyList();
			if(list6==list10){
				System.out.println("list10==list9");
			}
			//list6.add("sdfds");
			//System.out.println(list6);
			
			
			Map<String, Coupon> map= new HashMap<>();
			Coupon obj= new Coupon();
			obj.code="332";
			obj.category="434";
			obj.upc="4343";
			map.put(obj.code,obj);
			
			
			List<Coupon> list= new ArrayList<>();
			list.add(obj);
	}

}

class Coupon{
	String code;
	String upc;
	String category;

}