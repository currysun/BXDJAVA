package Day18;

/*
 * 1.���mapԪ�صķ��� put
 * 2.��mapת��ΪSet��keySet �� entrySet ������
 * 		keySet ֻȡkey��entrySetȡ��ϵĶ��󣬲����õ��ڲ���̬�ӿ� Map.Entry.
 * 		Map.Entry�ṩһЩ�����ķ����� ��ȡmap �����еļ�ֵ��ʵ��ֵ�� 
 * 3.values ��������Collection �ӿڣ���ֱ��ʹ��Iterator����������map��values
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//hashMap �����
		Map<Integer, String> map=new HashMap<Integer,String>();  
		map.put(30, "curry");
		map.put(15, "thomphson");
		map.put(23, "green");
		map.put(6, "young");
		System.out.println(map.put(35, "durant"));//put �������keyֵ����Ӧ��value ֮ǰ��ma�в����ڣ��򷵻�null
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
