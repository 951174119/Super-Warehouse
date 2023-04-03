package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合特点
 * 无序：存取顺序不一致
 * 不重复：可以去除重复
 * 无索引：没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素
 * HashSet：无序、不重复、无索引
 * LinkedHashSet：有序、不重复、无索引
 * TreeSet：排序、不重复、无索引
 * Set集合去重复原因：先判断哈希值，在判断equals
 */
public class test1  {
    public static void main(String[] args) {
        Set<String > set1=new HashSet<>();
        set1.add("fgd");
        set1.add("qwe");
        set1.add("asd");
        set1.add("123");
        set1.add("123");
        System.out.println(set1);
        System.out.println("-----------------------"+"\n");
        Set<Student> studentSet=new HashSet<Student>();
        Student s1=new Student("小明",18,'男');
        Student s2=new Student("小明",18,'男');
        Student s3=new Student("小红",18,'女');
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        System.out.println(studentSet);
        //LinkedHashSet：有序、不重复、无索引  双链表

        /**
         * TreeSet：排序、不重复、无索引
         * 可排序：按照元素的大小默认升序（从大到小）
         * TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好
         * 注意：TreeSet集合是一定要排序的，可以将元素按照指定发规则进行排序
         * 对于数值类型：Integer，Double，官方默认按照大小进行升序排序
         * 对于字符串类型：默认按照首字符的编号升序排序
         * 对于自定义类型如Student对象，TreeSet无法直接排序
         * TreeSet集合存储对象的时候有两种方式可以设计自定义比较规则
         * 方式一：让自定义的类（如学生类）实现Comparable接口重写里面的compareTo方法来定制比较规则
         * 方式二：TreeSet集合有参数构造器，可以设置Comparator接口对应的比较器对象，来定制比较规则
         */
        System.out.println("-----------------------------"+"\n");
        Set<Student> studenttree=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age>=0?1:0;
            }
        });
        studenttree.add(s1);
        studenttree.add(s2);
        studenttree.add(s3);
        System.out.println(studenttree);


    }

}



























