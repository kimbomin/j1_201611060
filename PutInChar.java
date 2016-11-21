Map<String,String> m=new HashMap<String,String>();
m.getClass();
m.put("name","bm");
m.put("name","kbm");
m.put("num","1");
String[] words="Sangmyung university".split(" ");
words.length;
for(int i=0;i<words.length;i++)
   System.out.println(words[i]+" "+words[i+1]);
char[] letters="Sangmyung university".toCharArray();
letters[0];
letters[1];
Map<String,Integer> wc=new HashMap<String,Integer>();
wc.put("s",1);
wc.put("s",2);
wc.getClass();
wc.containsKey("s");
wc.put("s",3);
wc.get("s");
wc.get("s")+1;
wc.put("s",wc.get("s")+1);
String s;
for(char c:letters) {
   s=Character.toString(c);
   if(wc.containsKey(s)) {
      wc.put(s,wc.get(s)+1);
   } else {
      wc.put(s,1);
   }
}