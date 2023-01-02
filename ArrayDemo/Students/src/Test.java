public class Test {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号，姓名各不相同
        * 学生的属性：学号，姓名，年龄
        * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        * 要求2：添加完毕后，遍历所有学生信息
        * 要求3：通过id删除学生信息
        * 如果存在，则删除，如果不存在，则提示删除失败
        * 要求4：删除完毕之后，遍历所有学生信息
        * 要求5：查询数组id为"2"的学生，如果存在，则将他的年龄加1岁*/

        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象
        Student stu1 = new Student(1,"Lisi",18);
        Student stu2 = new Student(2,"Zhangsan",21);
        Student stu3 = new Student(3,"Wangwu",23);
        //3.添加到数组当中
        arr[0] =stu1;
        arr[1] =stu2;
        arr[2] =stu3;
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4,"Zhaoliu",20);
        //对id进行唯一性判断
        boolean flag = contains(arr,stu4.getId());
        if (flag){
            //已经存在不用添加
            System.out.println("当前id重复，请修改id后再进行添加");
        }else {
            //不存在，把学生对象添加到数组当中
            //1.数组已经存满，只能创建一个新的数组，新数组长度=老数组长度+1
            //2.数组没有存满，直接添加
            int count = getCount(arr);
            if (count == arr.length){
                //已经存满
                //创建一个新的数组，新数组长度=老数组长度+1
                //然后把老数组的元素，拷贝到新数组当中
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2：添加完毕后，遍历所有学生信息
                printArr(newArr);
            }else{
                //没有存满
                //[stu1,stu2,null]
                //getCount获取到的是2，便是数组当中已经有了2个元素
                //下一次添加数据数据，就是添加到2索引的位置
                arr[count] = stu4;
                //要求2：添加完毕后，遍历所有学生信息
                printArr(arr);
            }
        }
        //要求3：通过id删除学生信息
        //如果存在，则删除，如果不存在，则提示删除失败
        //找到id在数组中对应的索引
        int index = getIndex(arr,3);
        if (index >= 0){
            //如果存在，则删除
            arr[index] = null;
            //遍历数组
            printArr(arr);
        }else {
            //如果不存在，则表示删除失败
            System.out.println("当前id不存在，删除失败");
        }

        //要求5：查询数组id为"2"的学生，如果存在，则将他的年龄加1岁
        //先找到id为2的学生的索引
        int stuindex = getIndex(arr,2);
        //判断索引
        if (index >= 0 ){
            //存在，则将年龄加一
            Student students = arr[stuindex];
            int newAge = students.getAge() + 1 ;
            students.setAge(newAge);
            printArr(arr);
        }else {
            //不存在
            System.out.println("当前id不存在，修改失败");
        }
    }

    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student student = arr[i];
            if (student != null){
                int sid = student.getId();;
                if (id == sid){
                    return i;
                }
            }
        }
        //当循环结束后，还没有找到表示不存在
        return -1;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null){
                System.out.println(student.getId()+","+student.getName()+","+student.getAge());
            }
        }
    }

    //创建一个新的数组，新数组长度=老数组长度+1
    //然后把老数组的元素，拷贝到新数组当中
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        //遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //返回新数组
        return newArr;
    }


    //定义方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr){
        //定义一个计算器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            Student student = arr[i];
            if (student != null){
                //获取数组中学生对象的id
                int sid = student.getId();
                if (sid == id){
                    return true; //表示存在
                }
            }
        }
        //循环结束，没有找到一样的，表示不存在
        return false;
    }
}
