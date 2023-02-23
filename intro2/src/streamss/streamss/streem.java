package streamss.streamss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streem {
	
	@Test
	public void streamFiltr() {
		
		 ArrayList<String> names=new ArrayList<String>();
		 names.add("ina");
		 names.add("meena");
		 names.add("dika");
		 names.add("oooo");
		 names.add("fantastica");
		 names.add("funnystidddca");
		 
		 long l=names.stream().filter(f->f.startsWith("f")).count();
		System.out.println(l);
	
long o=Stream.of("maadi","modosa","dadaa","yabas").filter(s->
	{
		return s.endsWith("a");
	}).count();
	System.out.println(o);
	}
	//names.stream().filter(f->f.endsWith("a")).limit(1).forEach(f->System.out.println(f));	//limitting results name ends with a
	//names.stream().filter(q->q.length()>6).limit(1).forEach(q->System.out.println(q));*/
	
	@Test
	public void streamFiltrr() {
	/*String[] namer=new String[5];
	namer[0]="00eaas";
	namer[1]="Gridaas";
	namer[2]="floraida";
	namer[3]="zinfat";
	namer[4]="mronosa";
	List<String> neer=Arrays.asList(namer);
	
	String[] namess= {"maadi","modos","dadaa","yabas"};
	List <String> neems=Arrays.asList(namess);
	neems.stream().filter(h->h.endsWith("a")).map(h->h.toUpperCase()).forEach(h->System.out.println(h));	//mapping and printing
	neems.stream().filter(k->k.startsWith("m")).sorted().map(k->k.toLowerCase()).forEach(k->System.out.println(k)); // mapping sortig printing

	//...mERGING TWO STREAMS AND FINDING ZINFAT NAME PRESENT IN MERGED STREAM....//
	Stream<String> bree=Stream.concat(neer.stream(), neems.stream());
	boolean b=bree.anyMatch(z->z.equalsIgnoreCase("zinFAT"));
	System.out.println(b);
	Assert.assertTrue(b);
	}*/
	}
@Test
public void streeems()
{
	String[] namer=new String[5];
	namer[0]="00eaas";
	namer[1]="Gridaas";
	namer[2]="floraida";
	namer[3]="zinfat";
	namer[4]="mronosa";
	List<String> neer=Arrays.asList(namer);
	
	String[] namess= {"maadi","modos","dadaa","yabas"};		
	List <String> neems=Arrays.asList(namess);
	//List<String> sr=Arrays.asList("maadi","modos","dadaa","yabas");
	Stream<String> x=Stream.concat(neer.stream(), neems.stream());
	List<String> ls=x.filter(m->m.endsWith("a")).sorted().collect(Collectors.toList());
	System.out.println(ls.get(2));
	
	
	
	//print unique number from array + // sort the array - print 3rd index of the array
	
	
	List<Integer> li=Arrays.asList(51,21,12,65,21,99,99);
	//int[] li= {51,21,12,65,21,99,99};
	//List<int[]> lii=Arrays.asList(li);
	List<Integer>leee=li.stream().distinct().sorted().collect(Collectors.toList());
	//System.out.println(leee.get(2));
	li.stream().distinct().sorted().limit(2).forEach(z->System.out.println(z));
	
}}


