package com.miguo.huawei;

public class demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*1.�߼������
&�߼���:��false��false��
|�߼���:��true��true��
^�߼����:��ͬΪfalse����ͬΪtrue��
!�߼���:��false��true����true��false��
<<:����	������λ�������ұ߲���0
>>:����	���λ��0����߲���0;���Ϊ��1����߲���1
>>>:�޷������� �������λ��0����1����߲���0
2.��Ԫ������ĸ�ʽ
(��ϵ���ʽ) ? ���ʽ1 : ���ʽ2;
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
3.switch���ĸ�ʽ
switch(���ʽ) {
	      case ֵ1��
			�����1;
			break;
	      case ֵ2��
			�����2;
			break;
		    ��
	      default��	
			�����n+1;
			break;
    }
4.ѭ���ṹdo...while���ĸ�ʽ��
	do {
		ѭ�������;
	}while(�ж��������);
	
	������ʽ��
	��ʼ�����;
	do {
		ѭ�������;
		�����������;
	}while(�ж��������);
5.ѭ���ṹwhile���ĸ�ʽ��
	whileѭ���Ļ�����ʽ��
	while(�ж��������) {
		ѭ�������;
	}
	������ʽ��
	��ʼ�����;
    while(�ж��������) {
		 ѭ�������;
		 �����������;
	}
6.Eclipse�п�ݼ���ʹ��)(����)
A:�½� ctrl + n
B:��ʽ��  ctrl+shift+f
C:�����  ctrl+shift+o 
D:ע��  ctrl+/,ctrl+shift+/,ctrl+shift+\
E:���������ƶ� ѡ�д���alt+��/�¼�ͷ
F:�鿴Դ��  ѡ������(F3����Ctrl+�����)
G:���Ҿ������ ctrl + shift + t
H:���Ҿ�����ľ��巽�� ctrl + o
I:������ ctrl+1,�����ұ�������ߵ���������,���ɷ���
J:ɾ������ ctrl + d
K:��ȡ����alt + shift + m 
L:����alt + shift + r 
7.String��
hasNextXxx()  �ж��Ƿ�����һ��������,����Xxx������Int,Double�ȡ������Ҫ�ж��Ƿ������һ���ַ����������ʡ��Xxx
nextXxx()  ��ȡ��һ�������Xxx�ĺ�����ϸ������е�Xxx��ͬ,Ĭ������£�Scannerʹ�ÿո񣬻س�����Ϊ�ָ���
public int nextInt():��ȡһ��int���͵�ֵ
public String nextLine():��ȡһ��String���͵�ֵ
�������췽��
public String():�չ���
public String(byte[] bytes):���ֽ�����ת���ַ���
public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
public String(char[] value):���ַ�����ת���ַ���
public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
public String(String original):���ַ�������ֵת���ַ���
String����жϹ���
boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
String��Ļ�ȡ����
int length():��ȡ�ַ����ĳ��ȡ�
char charAt(int index):��ȡָ������λ�õ��ַ�
int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
lastIndexOf
String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
String��ת�����ܣ�
byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
static String valueOf(char[] chs):���ַ�����ת���ַ�����
static String valueOf(int i):��int���͵�����ת���ַ�����
	ע�⣺String���valueOf�������԰��������͵�����ת���ַ���
String toLowerCase():���ַ���ת��Сд��(�˽�)
String toUpperCase():���ַ���ת�ɴ�д��
String concat(String str):���ַ���ƴ�ӡ�
String���滻���ܼ�������ʾ
String replace(char old,char new)
String replace(String old,String new)
String��ȥ���ַ������ո�
String trim()
String�İ��ֵ�˳��Ƚ������ַ���
int compareTo(String str)(��ʱ��������)
int compareToIgnoreCase(String str)(�˽�)
String��Ĺ��ܣ�public String[] split(String regex)
String��Ĺ��ܣ�public String replaceAll(String regex,String replacement)
8.������ʽ
�ַ���
[abc] a��b �� c�����ࣩ 
[^abc] �κ��ַ������� a��b �� c���񶨣� 
[a-zA-Z] a�� z �� A�� Z����ͷ����ĸ�������ڣ���Χ�� 
[0-9] 0��9���ַ�������
Ԥ�����ַ���
. �κ��ַ���
\d ���֣�[0-9]
\w �����ַ���[a-zA-Z_0-9]
Greedy ������ 
X? X��һ�λ�һ��Ҳû��
X* X����λ���
X+ X��һ�λ���
X{n} X��ǡ�� n �� 
X{n,} X������ n �� 
X{n,m} X������ n �Σ����ǲ����� m ��
Pattern��Matcher�ĸ���
ͨ��JDK�ṩ��API���鿴Pattern���˵�� 
Pattern p = Pattern.compile("a*b");
Matcher m = p.matcher("aaaaab");
boolean b = m.matches();
9.Math�����
Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
B:��Ա����
public static int abs(int a)
public static double ceil(double a)
public static double floor(double a)
public static int max(int a,int b) min��ѧ
public static double pow(double a,double b)
public static double random()
public static int round(float a) ����Ϊdouble����ѧ
public static double sqrt(double a)
10.Random��ĸ���
�������ڲ���������������ͬ�����Ӵ������� Random ʵ����
���ÿ��ʵ��������ͬ�ķ����������У����ǽ����ɲ�������ͬ���������С�
B:���췽��
public Random()
public Random(long seed)
C:��Ա����
public int nextInt()
public int nextInt(int n)(�ص�����)
11.System��ĸ���
System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
B:��Ա����
public static void gc()
public static void exit(int status)
public static long currentTimeMillis()
pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
12.BigInteger�ĸ���
�����ó���Integer��Χ�ڵ����ݽ�������
B:���췽��
public BigInteger(String val)
C:��Ա����
public BigInteger add(BigInteger val)
public BigInteger subtract(BigInteger val)
public BigInteger multiply(BigInteger val)
public BigInteger divide(BigInteger val)
public BigInteger[] divideAndRemainder(BigInteger val)
13.BigDecimal�ĸ���
�����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
���ɱ�ġ����⾫�ȵ��з���ʮ��������
B:���췽��
public BigDecimal(String val)
C:��Ա����
public BigDecimal add(BigDecimal augend)
public BigDecimal subtract(BigDecimal subtrahend)
public BigDecimal multiply(BigDecimal multiplicand)
public BigDecimal divide(BigDecimal divisor)
14.Date��ĸ���
�� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
B:���췽��
public Date()
public Date(long date)
C:��Ա����
public long getTime()
public void setTime(long time)
15.DateFormat��ĸ���
DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
B:SimpleDateFormat���췽��
public SimpleDateFormat()
public SimpleDateFormat(String pattern)
C:��Ա����
public final String format(Date date)
public Date parse(String source)
16.Calendar��ĸ���
Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
B:��Ա����
public static Calendar getInstance()
public int get(int field)
��Ա����
public void add(int field,int amount)
public final void set(int year,int month,int date)
17.Collection����
boolean add(E e)
boolean remove(Object o)
void clear()
boolean contains(Object o)
boolean isEmpty()
int size()
Collection coll = new ArrayList();
Object[] arr = coll.toArray();	//������ת��������
boolean addAll(Collection c)
boolean removeAll(Collection c)
boolean containsAll(Collection c)
boolean retainAll(Collection c)
18.���ϵı���֮����������
Collection c = new ArrayList();
	c.add("a");
	c.add("b");
	c.add("c");
	c.add("d");		
Iterator it = c.iterator();		//��ȡ������������
	while(it.hasNext()) {		//�����еĵ�������(����)
		System.out.println(it.next());
	}
19.List����
void add(int index,E element)
E remove(int index)
E get(int index)
E set(int index,E element)
����������Ԫ�أ��������޸�Ԫ��(ListIterator�����й���add)
���ϱ���Ԫ�أ������޸�Ԫ��

ListIterator lit = list.listIterator();		//������ڱ����Ĺ��������Ԫ��,������ListIterator�е�add����
	while(lit.hasNext()) {
		String str = (String)lit.next();
		if(str.equals("world")) {
			lit.add("javaee");	
			//list.add("javaee");
		}
	}
20.���Ͽ��(ListIterator)(�˽�)
boolean hasNext()�Ƿ�����һ��
boolean hasPrevious()�Ƿ���ǰһ��
Object next()������һ��Ԫ��
Object previous();������һ��Ԫ��
21.���Ͽ��(Vector�����й���)(�˽�)
Vector�����й���
public void addElement(E obj)
public E elementAt(int index)
public Enumeration elements()
������ʾ	
Vector�ĵ���
	Vector v = new Vector();		//�������϶���,List������
	v.addElement("a");
	v.addElement("b");
	v.addElement("c");
	v.addElement("d");
	Enumeration en = v.elements();			//��ȡö��
	while(en.hasMoreElements()) {			//�жϼ������Ƿ���Ԫ��
		System.out.println(en.nextElement());//��ȡ�����е�Ԫ��
	}
22.LinkedList�����й���)
LinkedList�����й���
	public void addFirst(E e)��addLast(E e)
	public E getFirst()��getLast()
	public E removeFirst()��public E removeLast()
	public E get(int index);
23.���Ͽ��(ArrayList�洢�ַ������Զ�����󲢱�����ǿfor��)
ArrayList�洢�ַ�����������ǿfor��
	ArrayList<String> list = new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	for(String s : list) {
		System.out.println(s);
	}
24.Arrays��
public static String toString(int[] a);����ת�ַ���
public static void sort(int[] a);����
public static int binarySearch(int[] a��int key);
String[] arr={"a","b","c"};
List<String> list=Arrays.alist;
25.Integer��
public static String tobinaryString(int a);ת������
public static String tooctalString(int a);ת�˽���
public static String toHexString(int a);תʮ������
26.
27.Map����
a:��ӹ���
	V put(K key,V value):���Ԫ�ء�
		������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
		��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
b:ɾ������
	void clear():�Ƴ����еļ�ֵ��Ԫ��
	V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
c:�жϹ���
	boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
	boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
	boolean isEmpty()���жϼ����Ƿ�Ϊ��
d:��ȡ����
	Set<Map.Entry<K,V>> entrySet():
	V get(Object key):���ݼ���ȡֵ
	Set<K> keySet():��ȡ���������м��ļ���
	Collection<V> values():��ȡ����������ֵ�ļ���
e:���ȹ���
	int size()�����ؼ����еļ�ֵ�Եĸ���
28.Map���ϵı���֮����ֵ

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("����", 23);
		hm.put("����", 24);
		hm.put("����", 25);
		hm.put("����", 26);
		
Set<String> keySet = hm.keySet();	//��ȡ���������еļ�
Iterator<String> it = keySet.iterator();	//��ȡ������
while(it.hasNext()) {			//�жϵ��м������Ƿ���Ԫ��
String key = it.next();		//��ȡ�����е�ÿһ��Ԫ��,��ʵ����˫�м����еļ�
	Integer value = hm.get(key);			//���ݼ���ȡֵ
System.out.println(key + "=" + value);	//��ӡ��ֵ��
	}*/
/*for(String key : hm.keySet()) {				
	System.out.println(key + "=" + hm.get(key));
	}
29.Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("����", 23);
		hm.put("����", 24);
		hm.put("����", 25);
		hm.put("����", 26);
	Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
	Iterator<Entry<String, Integer>> it = entrySet.iterator();//��ȡ������
	while(it.hasNext()) {
		Entry<String, Integer> en = it.next();		//��ȡ��ֵ�Զ���
		String key = en.getKey();		//���ݼ�ֵ�Զ����ȡ��
		Integer value = en.getValue();		//���ݼ�ֵ�Զ����ȡֵ
			System.out.println(key + "=" + value);
		}*/
		
	/*for(Entry<String,Integer> en : hm.entrySet()) {
		System.out.println(en.getKey() + "=" + en.getValue());
		}
30.Collections������
Collections��Ա����
	public static <T> void sort(List<T> list)
	public static <T> int binarySearch(List<?> list,T key)
	public static <T> T max(Collection<?> coll)
	public static void reverse(List<?> list)
	public static void shuffle(List<?> list) //ʹ��ָ�������Դ�������ָ�����б� 
	public static void reverse(List<?> list) //��תָ���б���Ԫ�ص�˳��
31.�쳣(try...catch�ķ�ʽ�����쳣)
�쳣��������ַ�ʽ
	try��catch��finally
	try catch
	try catch finally
	try finally 
throws
	try...catch�����쳣�Ļ�����ʽ
	try��catch��finally
32.Throwable�ļ�����������
Throwable�ļ�����������
	a:getMessage()	��ȡ�쳣��Ϣ�������ַ�����
	b:toString()	��ȡ�쳣�������쳣��Ϣ�������ַ�����
c:printStackTrace()	��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
33.File��ĸ����͹��췽��)
B:���췽��
File(String pathname)������һ��·���õ�File����
File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
A:��������
public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
��������ɾ������
public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
public boolean delete():ɾ���ļ������ļ���
�жϹ���
public boolean isDirectory():�ж��Ƿ���Ŀ¼
public boolean isFile():�ж��Ƿ����ļ�
public boolean exists():�ж��Ƿ����
public boolean canRead():�ж��Ƿ�ɶ�
public boolean canWrite():�ж��Ƿ��д
public boolean isHidden():�ж��Ƿ�����
A:��ȡ����
public String getAbsolutePath()����ȡ����·��
public String getPath():��ȡ·��
public String getName():��ȡ����
public long length():��ȡ���ȡ��ֽ���
public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
34.IO��(FileInputStream)
read()һ�ζ�ȡһ���ֽ�
FileInputStream fis = new FileInputStream("aaa.txt");	//����һ���ļ�����������,������aaa.txt
int b;			/�������,��¼ÿ�ζ������ֽ�
while((b = fis.read()) != -1) {	//��ÿ�ζ������ֽڸ�ֵ��b���ж��Ƿ���-1
	System.out.println(b);		//��ӡÿһ���ֽ�
	}
	fis.close();	
IO��(FileOutputStream)
write()һ��д��һ���ֽ�
FileOutputStream fos = new FileOutputStream("bbb.txt");	//���û��bbb.txt,�ᴴ����һ��
fos.write(97);						
fos.write(98);
fos.write(99);
fos.close();
FileOutputStream�Ĺ��췽��д���������ʵ�����ݵ�׷��д��
FileOutputStream fos = new FileOutputStream("bbb.txt",true);	//���û��bbb.txt,�ᴴ����һ��
fos.write(97);//��Ȼд������һ��int��,������д����ʱ��Ὣǰ���24��0ȥ��,����д����һ��byte
fos.write(98);
fos.write(99);
fos.close();
FileInputStream fis = new FileInputStream("���ഺ.mp3");
FileOutputStream fos = new FileOutputStream("copy.mp3");
int len;
byte[] arr = new byte[1024 * 8];		//�Զ����ֽ�����
	while((len = fis.read(arr)) != -1) {
		//fos.write(arr);
		fos.write(arr, 0, len);		//д���ֽ�����д����Ч���ֽڸ���
	}
	fis.close();
	fos.close();*/





















