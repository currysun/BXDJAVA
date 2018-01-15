package Day18;

/*
 * 1.添加map元素的方法 put
 * 2.将map转化为Set，keySet 和 entrySet 方法。
 * 		keySet 只取key，entrySet取组合的对象，并且用到内部静态接口 Map.Entry.
 * 		Map.Entry提供一些便利的方法来 获取map 对象中的键值和实际值。 
 * 3.values 方法返回Collection 接口，可直接使用Iterator方法遍历其map的values
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//hashMap 无序的
		Map<Integer, String> map=new HashMap<Integer,String>();  
		map.put(30, "curry");
		map.put(15, "thomphson");
		map.put(23, "green");
		map.put(6, "young");
		System.out.println(map.put(35, "durant"));//put 方法如果key值所对应的value 之前在ma中不存在，则返回null
		//System.out.println(map.put(35, "Yao"));
		//valueMap(map);
		
		//valueMap_2(map);
		
		values_Map(map);
	}

	public static void values_Map(Map<Integer, String> map) {
		Collection<String> values=map.values();
		Iterator<String> it=values.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}

	public static void valueMap_2(Map<Integer, String> map) {
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=entrySet.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> me=it.next();
		
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":"+value);
			
		}
		
	}

	public static void valueMap(Map<Integer, String> map) {
		Set<Integer> keySet=map.keySet();
		Iterator<Integer> it=keySet.iterator();
		
		while(it.hasNext()) {
			Integer key=it.next();
			String value=map.get(key);
			System.out.println(key+":"+value);
			
		}
		
		
	}

	
}
