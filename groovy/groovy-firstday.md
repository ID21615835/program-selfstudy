# groovy
## first day

[学习网站地址]Groovy (https://www.w3cschool.cn/groovy/groovy_overview.html)

### 包括内容为
Groovy
- [  ✓]Groovy 概述 
 Groovy 是基于java 平台的面向对象的语言。 

- [  ✓] Groovy 环境  
如果需要groovy 二级制文件作为maven或gradle构建的一部分，需要增加
maven：
```
<groupId>org.codehaus.groovy</groupId>
<artifactId>groovy</artifactId>
<version>2.4.5</version>
 ```
gradle ：
```
'org.codehaus.groovy:groovy:2.4.5'
```

- [ ]Groovy 基本语法
默认情况下 ， Groovy 在代码中包括以下库，因起不用导入他们：
```
import java.lang.* 
import java.util.* 
import java.io.* 
import java.net.* 

import groovy.lang.* 
import groovy.util.* 

import java.math.BigInteger 
import java.math.BigDecimal
```

 #### 身份识别符
 识别符一字母开头，美元符号或者下划线。他们不能数据开头。其中，DEF 是在 Groovy 用来定义标识符的关键字。

#### 关键字
|   |   |  |   |
|  :----:  | :----:  | :----: | :----:  |
| as | assert | break | case | 
| catch | class | const | continue |
def | default | do | else
enum | extends | false | Finally
for | goto | if | implements
import | in | instanceof | interface
new | pull | package | return
super | switch | this | throw
throws | trait | true | try
while |   |   |  


#### 空白  
空白是在编程语言如 Java 和 Groovy 用来形容空格，制表符，换行符和注释术语。空格分隔从另一个声明的一部分，使编译器，其中一个元素标识的声明。

例如，在下面的代码示例，存在关键字 def 和变量 x 之间的空白。这是为了让编译器知道 DEF 是需要被使用，并且是 x 应该是需要被定义的变量名的关键字
```
def x = 5;
```


- [ ]Groovy 数据类型 

在任何的编程语言中，都需要使用各种变量来存储各种类型的信息。
### 内置数据类型

- byte 表示一个字节值。例如2 
- short 表示一个短整型。 例如 10
- int 表示整数 。12345
- long 表示长类型 1234125425
- float 表示32位浮点数 例如12.343
- char 表示单个字符文字 “A"
- double 表示64位浮点数
- Boolean 表示布尔值，true或false
- String 以字符串的形式来表示文本， 例如： "Hello world "

- [ ]Groovy 变量

Groovy 可以通过两种方式来定义变量，用本地数据类型或者 def 关键词。 变量声明是为编译器 来构建一个存储位置。
- [ ]Groovy 运算符  
      - + 
- [ ]Groovy 循环
  - while语句
while语句首先通过计算条件表达式（布尔值）来执行，如果结果为真，则执行while循环中的语句。  
-  for , for-in  用于遍历一组值。
-  break  用于改变循环和switch 语句内的控制流
- continue 补充break 语句，他的使用仅限于while和for循环。
  
- [ ]Groovy 条件语句

- if ， if/else , switch , 嵌套switch

- [ ]Groovy 方法
Groovy 使用返回类型或者关键字def 来定义。方法可以接受任意数量的参数。定义参数时，不必显式定义类型。可以增加修饰符：pubilc， private，protected。 默认情况，如果没有提供可见性的修饰符，则该方法为public。 

- [ ]Groovy 文件I/O
File  eachline  withwriter
dir
- [ ]Groovy 可选
鸭子式 输入 变量名称比它们代表的类跟多，会使得代码更容易理解。
- [ ]Groovy 数字
在 Groovy 中，数字实际上表示为对象，它们都是类 Integer 的一个实例。要使对象做某事，我们需要调用在其类中声明的一个方法。
- toString()
该方法用于获取表示 Number 对象的值的 String 对象。

- [ ]Groovy 字符串
reverse通过在引号中包含字符串文本，在Groovy中构造一个字符串文字。

Groovy提供了多种表示String字面量的方法。 Groovy中的字符串可以用单引号（'），双引号（“）或三引号（”“”）括起来。此外，由三重引号括起来的Groovy字符串可以跨越多行。

- [ ]Groovy 范围
范围是指定值序列的速记。范围由序列中的第一个和最后一个值表示，Range可以是包含或排除。包含范围包括从第一个到最后一个的所有值，而独占范围包括除最后一个之外的所有值。

- [ ]Groovy 列表
列表是用于存储数据项集合的结构。在 Groovy 中，List 保存了一系列对象引用。

List 中的对象引用占据序列中的位置，并通过整数索引来区分。

- [ ]Groovy 映射
映射（也称为关联数组，字典，表和散列）是对象引用的无序集合。map集合中的元素由键值访问。
containsKey()
此映射是否包含此键？

get()
查找此Map中的键并返回相应的值。如果此映射中没有键的条目，则返回null。

- [ ]Groovy 时间和日期
```
class Example {
   static void main(String[] args) {
      Date date = new Date(100);
      
      // display time and date using toString()
      System.out.println(date.toString());
   } 
}
```
- [ ]Groovy 正则表达式

正则表达式是用于在文本中查找子字符串的模式。 Groovy 使用〜“regex”表达式本地支持正则表达式。引号中包含的文本表示用于比较的表达式。
```
def regex = ~'Groovy'
```


- [ ]Groovy 异常处理

任何编程语言都需要异常处理来处理运行时错误，从而可以保持应用程序的正常流程。

异常通常会破坏应用程序的正常流程，这就是为什么我们需要在我们的应用程序中使用异常处理的原因。
-  检查异常 
        - 扩展Throwable 类（除了RuntimeException和Error）的类称为检查异常。检查的异常在编译时检查。
- 未检查异常
        - RuntimeException 未检查的异常在编译期不检查，而是在运行时检查。
- 错误 
        错误无法恢复。OutOfMemoryError，viratuaMcachineError.这些是程序永远无法恢复的错误，将导致程序崩溃。

- # 捕捉异常
```
try {

    //protected codehaus

}catch( ExceptionName e1){
    // Catch block 
}
```

以下是Groovy中提供的异常方法 -

public String getMessage（）
返回有关已发生异常的详细消息。此消息在Throwable构造函数中初始化。

public Throwable getCause()
返回由Throwable对象表示的异常原因。

public String toString()
返回与getMessage（）的结果连接的类的名称。

public void printStackTrace()
将toString（）的结果与堆栈跟踪一起打印到System.err，错误输出流。

public StackTraceElement [] getStackTrace()
返回包含堆栈跟踪上的每个元素的数组。索引0处的元素表示调用堆栈的顶部，数组中的最后一个元素表示调用堆栈底部的方法。

public Throwable fillInStackTrace()
使用当前堆栈跟踪填充此Throwable对象的堆栈跟踪，添加到堆栈跟踪中的任何以前的信息。


```
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      }catch(ArrayIndexOutOfBoundsException ex) {
         println(ex.toString());
         println(ex.getMessage());
         println(ex.getStackTrace());  
      } catch(Exception ex) {
         println("Catching the exception");
      }finally {
         println("The final block");
      }
		
      println("Let's move on after the exception");
   } 
}

```


- [ ]Groovy 面向对象
- [ ]Groovy 泛型
- [ ]Groovy 特征

         