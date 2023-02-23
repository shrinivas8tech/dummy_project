package streamss.streamss;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class tryo {

	@Test
	public void adlo() {
		
		String[] a= {"df","dfsf","sdfww","iwuip","fsfdhuishfuf"}; 
		List<String> f=Arrays.asList(a);
		
		
		ArrayList<String> names=new ArrayList<String>();
		 names.add("ina");
		 names.add("meena");
		 names.add("dika");
		 names.add("oooo");
		 names.add("fantastica");
		 names.add("funnystidddca");
		 
		 String [] v= {"ccsfs","aaaad","aadfdsf","bbdfsdfsd","dfsf"};
		 List<String> n=Arrays.asList(v);
		 Stream<String> s=Stream.concat(n.stream(), f.stream());
		boolean b=s.anyMatch(z->z.equalsIgnoreCase("df"));
		System.out.println(b);
		 f.stream().filter(c->c.endsWith("f")).forEach(c->System.out.println(c));
		
		List<String> lp= n.stream().sorted().collect(Collectors.toList());
		System.out.println(lp);
		int[] in= {11,21,336,659,5556,321,21};
		List<int[]> ir=Arrays.asList(in);
		List<Integer> opp=Arrays.asList(12,99,887,5,9,9,9,59,5,55);
		List<Integer>oi=opp.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(oi);
	}
}
