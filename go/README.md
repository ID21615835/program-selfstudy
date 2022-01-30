# learn golang

## go

- [适合 Go 新手学习的开源项目——在 GitHub 学编程](https://www.cnblogs.com/xueweihan/p/13997806.html)
- [github book](https://github.com/unknwon/the-way-to-go_ZH_CN)
- [go语言入门练手项目推荐](https://zhuanlan.zhihu.com/p/369143210)    
- [7days实现项目](https://github.com/geektutu/7days-golang)

## what is the golang

2007 年因为受够了C++ 语言煎熬的Google首席软件工程师Rob pike 和 Robert Griesemer and Ken Thompson 三人决定创作一种语言来取代C++ ， 这个就是go语言的由来

在2009年11月10日Google正式发布Go 这个编程语言。Go语言从C语言继承了相似的表达方式，控制流结构，基础数据类型、调用参数传值，指针等很多思想。还有 Go 语言一直被看中 编译后的机器码的运行效率以及和现有的操作系统无缝适配。

## 为什么要创造一门编程语言
- C/C++ 的发展速度无法跟上计算机发展的脚步，十多年来也没有出现一门与时代相符的主流系统编程语言，因此人们需要一门新的系统编程语言来弥补这个空缺，尤其是在计算机信息时代。  
- 相比计算机性能的提升，软件开发领域不被认为发展得足够快或者比硬件发展得更加成功（有许多项目均以失败告终），同时应用程序的体积始终在不断地扩大，这就迫切地需要一门具备更高层次概念的低级语言来突破现状。  
- 在 Go 语言出现之前，开发者们总是面临非常艰难的抉择，究竟是使用执行速度快但是编译速度并不理想的语言（如：C++），还是使用编译速度较快但执行效率不佳的语言（如：.NET、Java），或者说开发难度较低但执行速度一般的动态语言呢？显然，Go 语言在这 3 个条件之间做到了最佳的平衡：快速编译，高效执行，易于开发。


## 语言的特性
Go 语言从本质上（程序和结构方面）来实现并发编程。

因为 Go 语言没有类和继承的概念，所以它和 Java 或 C++ 看起来并不相同。但是它通过接口（interface）的概念来实现多态性。Go 语言有一个清晰易懂的轻量级类型系统，在类型之间也没有层级之说。因此可以说这是一门混合型的语言。

在传统的面向对象语言中，使用面向对象编程技术显得非常臃肿，它们总是通过复杂的模式来构建庞大的类型层级，这违背了编程语言应该提升生产力的宗旨。

函数是 Go 语言中的基本构件，它们的使用方法非常灵活。在第六章，我们会看到 Go 语言在函数式编程方面的基本概念。

Go 语言使用静态类型，所以它是类型安全的一门语言，加上通过构建到本地代码，程序的执行速度也非常快。

作为强类型语言，隐式的类型转换是不被允许的，记住一条原则：让所有的东西都是显式的。

Go 语言其实也有一些动态语言的特性（通过关键字 var），所以它对那些逃离 Java 和 .Net 世界而使用 Python、Ruby、PHP 和 JavaScript 的开发者们也具有很大的吸引力。

Go 语言支持交叉编译，比如说你可以在运行 Linux 系统的计算机上开发运行 Windows 下运行的应用程序。这是第一门完全支持 UTF-8 的编程语言，这不仅体现在它可以处理使用 UTF-8 编码的字符串，就连它的源码文件格式都是使用的 UTF-8 编码。Go 语言做到了真正的国际化！

Often times, a new project starts with a list of tasks to outline what needs to be done quickly.

Although some online tools are useful to manage larger projects efficiently, using them in the early stages will add more effort and overhead for small projects.

A few other reasons like: portable plain text format, same project directory, offline working, privacy, versioning (using git), minimalist tool, etc.

### TODO.md format

- TODO.md can have multiple columns.
- Each column has tasks that start with a checkbox sign `- [ ]` or just a hyphen `- `
- Completed column name must contain `✓` or `[x]`.
- There are "2 spaces" at the end of every task title to serve as line breaks on Github pages.
- Tags, mentions, estimates, date time, ticket id, etc. can be entered at the end of the task title.
- A task with 2 space indentation in the title is a sub-task or description.

```
# Project Name
Project Description

### Column Name
- [ ] Task title ~3d #type @name yyyy-mm-dd  
  - [ ] Sub-task or description  

### Completed Column ✓
- [x] Completed task title  
```

- Checkboxes are used as described in [GFM - GitHub Flavored Markdown - Task Lists](https://guides.github.com/features/mastering-markdown/#GitHub-flavored-markdown) but they are optional.
- A task list without checkboxes look like this:

```
### Column Name
- Task title ~3d #type @name yyyy-mm-dd  
  - Sub-task or description  

### Completed Column ✓
- Completed task title  
```

### See also

- [An example of TODO.md](TODO.md)
- [Vscode Kanban Extension](https://bit.ly/2JcrUWJ)
