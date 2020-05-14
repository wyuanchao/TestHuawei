package com.miguo.huawei;

public class demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*1.逻辑运算符
&逻辑与:有false则false。
|逻辑或:有true则true。
^逻辑异或:相同为false，不同为true。
!逻辑非:非false则true，非true则false。
<<:左移	左边最高位丢弃，右边补齐0
>>:右移	最高位是0，左边补齐0;最高为是1，左边补齐1
>>>:无符号右移 无论最高位是0还是1，左边补齐0
2.三元运算符的格式
(关系表达式) ? 表达式1 : 表达式2;
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
3.switch语句的格式
switch(表达式) {
	      case 值1：
			语句体1;
			break;
	      case 值2：
			语句体2;
			break;
		    …
	      default：	
			语句体n+1;
			break;
    }
4.循环结构do...while语句的格式：
	do {
		循环体语句;
	}while(判断条件语句);
	
	完整格式；
	初始化语句;
	do {
		循环体语句;
		控制条件语句;
	}while(判断条件语句);
5.循环结构while语句的格式：
	while循环的基本格式：
	while(判断条件语句) {
		循环体语句;
	}
	完整格式：
	初始化语句;
    while(判断条件语句) {
		 循环体语句;
		 控制条件语句;
	}
6.Eclipse中快捷键的使用)(掌握)
A:新建 ctrl + n
B:格式化  ctrl+shift+f
C:导入包  ctrl+shift+o 
D:注释  ctrl+/,ctrl+shift+/,ctrl+shift+\
E:代码上下移动 选中代码alt+上/下箭头
F:查看源码  选中类名(F3或者Ctrl+鼠标点击)
G:查找具体的类 ctrl + shift + t
H:查找具体类的具体方法 ctrl + o
I:给建议 ctrl+1,根据右边生成左边的数据类型,生成方法
J:删除代码 ctrl + d
K:抽取方法alt + shift + m 
L:改名alt + shift + r 
7.String类
hasNextXxx()  判断是否还有下一个输入项,其中Xxx可以是Int,Double等。如果需要判断是否包含下一个字符串，则可以省略Xxx
nextXxx()  获取下一个输入项。Xxx的含义和上个方法中的Xxx相同,默认情况下，Scanner使用空格，回车等作为分隔符
public int nextInt():获取一个int类型的值
public String nextLine():获取一个String类型的值
常见构造方法
public String():空构造
public String(byte[] bytes):把字节数组转成字符串
public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
public String(char[] value):把字符数组转成字符串
public String(char[] value,int index,int count):把字符数组的一部分转成字符串
public String(String original):把字符串常量值转成字符串
String类的判断功能
boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
boolean contains(String str):判断大字符串中是否包含小字符串
boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
boolean isEmpty():判断字符串是否为空。
String类的获取功能
int length():获取字符串的长度。
char charAt(int index):获取指定索引位置的字符
int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
lastIndexOf
String substring(int start):从指定位置开始截取字符串,默认到末尾。
String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
String的转换功能：
byte[] getBytes():把字符串转换为字节数组。
char[] toCharArray():把字符串转换为字符数组。
static String valueOf(char[] chs):把字符数组转成字符串。
static String valueOf(int i):把int类型的数据转成字符串。
	注意：String类的valueOf方法可以把任意类型的数据转成字符串
String toLowerCase():把字符串转成小写。(了解)
String toUpperCase():把字符串转成大写。
String concat(String str):把字符串拼接。
String的替换功能及案例演示
String replace(char old,char new)
String replace(String old,String new)
String的去除字符串两空格
String trim()
String的按字典顺序比较两个字符串
int compareTo(String str)(暂时不用掌握)
int compareToIgnoreCase(String str)(了解)
String类的功能：public String[] split(String regex)
String类的功能：public String replaceAll(String regex,String replacement)
8.正则表达式
字符类
[abc] a、b 或 c（简单类） 
[^abc] 任何字符，除了 a、b 或 c（否定） 
[a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
[0-9] 0到9的字符都包括
预定义字符类
. 任何字符。
\d 数字：[0-9]
\w 单词字符：[a-zA-Z_0-9]
Greedy 数量词 
X? X，一次或一次也没有
X* X，零次或多次
X+ X，一次或多次
X{n} X，恰好 n 次 
X{n,} X，至少 n 次 
X{n,m} X，至少 n 次，但是不超过 m 次
Pattern和Matcher的概述
通过JDK提供的API，查看Pattern类的说明 
Pattern p = Pattern.compile("a*b");
Matcher m = p.matcher("aaaaab");
boolean b = m.matches();
9.Math类概述
Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
B:成员方法
public static int abs(int a)
public static double ceil(double a)
public static double floor(double a)
public static int max(int a,int b) min自学
public static double pow(double a,double b)
public static double random()
public static int round(float a) 参数为double的自学
public static double sqrt(double a)
10.Random类的概述
此类用于产生随机数如果用相同的种子创建两个 Random 实例，
则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
B:构造方法
public Random()
public Random(long seed)
C:成员方法
public int nextInt()
public int nextInt(int n)(重点掌握)
11.System类的概述
System 类包含一些有用的类字段和方法。它不能被实例化。 
B:成员方法
public static void gc()
public static void exit(int status)
public static long currentTimeMillis()
pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
12.BigInteger的概述
可以让超过Integer范围内的数据进行运算
B:构造方法
public BigInteger(String val)
C:成员方法
public BigInteger add(BigInteger val)
public BigInteger subtract(BigInteger val)
public BigInteger multiply(BigInteger val)
public BigInteger divide(BigInteger val)
public BigInteger[] divideAndRemainder(BigInteger val)
13.BigDecimal的概述
由于在运算的时候，float类型和double很容易丢失精度，演示案例。
所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
不可变的、任意精度的有符号十进制数。
B:构造方法
public BigDecimal(String val)
C:成员方法
public BigDecimal add(BigDecimal augend)
public BigDecimal subtract(BigDecimal subtrahend)
public BigDecimal multiply(BigDecimal multiplicand)
public BigDecimal divide(BigDecimal divisor)
14.Date类的概述
类 Date 表示特定的瞬间，精确到毫秒。 
B:构造方法
public Date()
public Date(long date)
C:成员方法
public long getTime()
public void setTime(long time)
15.DateFormat类的概述
DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
B:SimpleDateFormat构造方法
public SimpleDateFormat()
public SimpleDateFormat(String pattern)
C:成员方法
public final String format(Date date)
public Date parse(String source)
16.Calendar类的概述
Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
B:成员方法
public static Calendar getInstance()
public int get(int field)
成员方法
public void add(int field,int amount)
public final void set(int year,int month,int date)
17.Collection集合
boolean add(E e)
boolean remove(Object o)
void clear()
boolean contains(Object o)
boolean isEmpty()
int size()
Collection coll = new ArrayList();
Object[] arr = coll.toArray();	//将集合转换成数组
boolean addAll(Collection c)
boolean removeAll(Collection c)
boolean containsAll(Collection c)
boolean retainAll(Collection c)
18.集合的遍历之迭代器遍历
Collection c = new ArrayList();
	c.add("a");
	c.add("b");
	c.add("c");
	c.add("d");		
Iterator it = c.iterator();		//获取迭代器的引用
	while(it.hasNext()) {		//集合中的迭代方法(遍历)
		System.out.println(it.next());
	}
19.List集合
void add(int index,E element)
E remove(int index)
E get(int index)
E set(int index,E element)
迭代器迭代元素，迭代器修改元素(ListIterator的特有功能add)
集合遍历元素，集合修改元素

ListIterator lit = list.listIterator();		//如果想在遍历的过程中添加元素,可以用ListIterator中的add方法
	while(lit.hasNext()) {
		String str = (String)lit.next();
		if(str.equals("world")) {
			lit.add("javaee");	
			//list.add("javaee");
		}
	}
20.集合框架(ListIterator)(了解)
boolean hasNext()是否有下一个
boolean hasPrevious()是否有前一个
Object next()返回下一个元素
Object previous();返回上一个元素
21.集合框架(Vector的特有功能)(了解)
Vector类特有功能
public void addElement(E obj)
public E elementAt(int index)
public Enumeration elements()
案例演示	
Vector的迭代
	Vector v = new Vector();		//创建集合对象,List的子类
	v.addElement("a");
	v.addElement("b");
	v.addElement("c");
	v.addElement("d");
	Enumeration en = v.elements();			//获取枚举
	while(en.hasMoreElements()) {			//判断集合中是否有元素
		System.out.println(en.nextElement());//获取集合中的元素
	}
22.LinkedList的特有功能)
LinkedList类特有功能
	public void addFirst(E e)及addLast(E e)
	public E getFirst()及getLast()
	public E removeFirst()及public E removeLast()
	public E get(int index);
23.集合框架(ArrayList存储字符串和自定义对象并遍历增强for版)
ArrayList存储字符串并遍历增强for版
	ArrayList<String> list = new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	for(String s : list) {
		System.out.println(s);
	}
24.Arrays类
public static String toString(int[] a);数组转字符串
public static void sort(int[] a);排序
public static int binarySearch(int[] a，int key);
String[] arr={"a","b","c"};
List<String> list=Arrays.alist;
25.Integer类
public static String tobinaryString(int a);转二进制
public static String tooctalString(int a);转八进制
public static String toHexString(int a);转十六进制
26.
27.Map集合
a:添加功能
	V put(K key,V value):添加元素。
		如果键是第一次存储，就直接存储元素，返回null
		如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
b:删除功能
	void clear():移除所有的键值对元素
	V remove(Object key)：根据键删除键值对元素，并把值返回
c:判断功能
	boolean containsKey(Object key)：判断集合是否包含指定的键
	boolean containsValue(Object value):判断集合是否包含指定的值
	boolean isEmpty()：判断集合是否为空
d:获取功能
	Set<Map.Entry<K,V>> entrySet():
	V get(Object key):根据键获取值
	Set<K> keySet():获取集合中所有键的集合
	Collection<V> values():获取集合中所有值的集合
e:长度功能
	int size()：返回集合中的键值对的个数
28.Map集合的遍历之键找值

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("张三", 23);
		hm.put("李四", 24);
		hm.put("王五", 25);
		hm.put("赵六", 26);
		
Set<String> keySet = hm.keySet();	//获取集合中所有的键
Iterator<String> it = keySet.iterator();	//获取迭代器
while(it.hasNext()) {			//判断单列集合中是否有元素
String key = it.next();		//获取集合中的每一个元素,其实就是双列集合中的键
	Integer value = hm.get(key);			//根据键获取值
System.out.println(key + "=" + value);	//打印键值对
	}*/
/*for(String key : hm.keySet()) {				
	System.out.println(key + "=" + hm.get(key));
	}
29.Map集合的遍历之键值对对象找键和值

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("张三", 23);
		hm.put("李四", 24);
		hm.put("王五", 25);
		hm.put("赵六", 26);
	Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
	Iterator<Entry<String, Integer>> it = entrySet.iterator();//获取迭代器
	while(it.hasNext()) {
		Entry<String, Integer> en = it.next();		//获取键值对对象
		String key = en.getKey();		//根据键值对对象获取键
		Integer value = en.getValue();		//根据键值对对象获取值
			System.out.println(key + "=" + value);
		}*/
		
	/*for(Entry<String,Integer> en : hm.entrySet()) {
		System.out.println(en.getKey() + "=" + en.getValue());
		}
30.Collections工具类
Collections成员方法
	public static <T> void sort(List<T> list)
	public static <T> int binarySearch(List<?> list,T key)
	public static <T> T max(Collection<?> coll)
	public static void reverse(List<?> list)
	public static void shuffle(List<?> list) //使用指定的随机源随机排列指定的列表。 
	public static void reverse(List<?> list) //反转指定列表中元素的顺序。
31.异常(try...catch的方式处理异常)
异常处理的两种方式
	try…catch…finally
	try catch
	try catch finally
	try finally 
throws
	try...catch处理异常的基本格式
	try…catch…finally
32.Throwable的几个常见方法
Throwable的几个常见方法
	a:getMessage()	获取异常信息，返回字符串。
	b:toString()	获取异常类名和异常信息，返回字符串。
c:printStackTrace()	获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
33.File类的概述和构造方法)
B:构造方法
File(String pathname)：根据一个路径得到File对象
File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
A:创建功能
public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
重命名和删除功能
public boolean renameTo(File dest):把文件重命名为指定的文件路径
public boolean delete():删除文件或者文件夹
判断功能
public boolean isDirectory():判断是否是目录
public boolean isFile():判断是否是文件
public boolean exists():判断是否存在
public boolean canRead():判断是否可读
public boolean canWrite():判断是否可写
public boolean isHidden():判断是否隐藏
A:获取功能
public String getAbsolutePath()：获取绝对路径
public String getPath():获取路径
public String getName():获取名称
public long length():获取长度。字节数
public long lastModified():获取最后一次的修改时间，毫秒值
public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
34.IO流(FileInputStream)
read()一次读取一个字节
FileInputStream fis = new FileInputStream("aaa.txt");	//创建一个文件输入流对象,并关联aaa.txt
int b;			/定义变量,记录每次读到的字节
while((b = fis.read()) != -1) {	//将每次读到的字节赋值给b并判断是否是-1
	System.out.println(b);		//打印每一个字节
	}
	fis.close();	
IO流(FileOutputStream)
write()一次写出一个字节
FileOutputStream fos = new FileOutputStream("bbb.txt");	//如果没有bbb.txt,会创建出一个
fos.write(97);						
fos.write(98);
fos.write(99);
fos.close();
FileOutputStream的构造方法写出数据如何实现数据的追加写入
FileOutputStream fos = new FileOutputStream("bbb.txt",true);	//如果没有bbb.txt,会创建出一个
fos.write(97);//虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的一个byte
fos.write(98);
fos.write(99);
fos.close();
FileInputStream fis = new FileInputStream("致青春.mp3");
FileOutputStream fos = new FileOutputStream("copy.mp3");
int len;
byte[] arr = new byte[1024 * 8];		//自定义字节数组
	while((len = fis.read(arr)) != -1) {
		//fos.write(arr);
		fos.write(arr, 0, len);		//写出字节数组写出有效个字节个数
	}
	fis.close();
	fos.close();*/





















