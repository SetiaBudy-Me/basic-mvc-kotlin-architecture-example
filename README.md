[![kotlin](https://img.shields.io/badge/Kotlin-1.3.xxx-brightgreen.svg)](https://kotlinlang.org/)
[![MVC](https://img.shields.io/badge/Clean--Code-MVC-brightgreen.svg)]() 
[![Kotlin-Android-Extensions](https://img.shields.io/badge/Kotlin--Android--Extensions-plugin-red.svg)](https://kotlinlang.org/docs/tutorials/android-plugin.html)

# Basic MVC Kotlin Architecture Example
Contoh aplikasi Android sederhana untuk menunjukkan cara kerja arsitektur MVC, menggunakan Kotlin.

### Screenshots

<div align:left;display:inline;>
  <img width="25%" height="25%" src="https://github.com/SetiaBudy-Me/basic-mvc-kotlin-architecture-example/blob/master/res/Image%20Screenshot%2001.jpeg"/>
  <img width="25%" height="25%" src="https://github.com/SetiaBudy-Me/basic-mvc-kotlin-architecture-example/blob/master/res/Image%20Screenshot%2002.jpeg"/>
  <img width="25%" height="25%" src="https://github.com/SetiaBudy-Me/basic-mvc-kotlin-architecture-example/blob/master/res/Image%20Screenshot%2003.jpeg"/>
</div>

$~~$
## MVC
***MVC (Model-View-Controller)*** adalah sebuah metode untuk membuat sebuah aplikasi dengan memisahkan data (Model) dari tampilan (View) dan cara bagaimana memprosesnya (Controller).

<p align="center">
  <img src="https://github.com/SetiaBudy-Me/basic-mvc-kotlin-architecture-example/blob/master/res/Android-MVC-Flow.jpg">
</p>

Masing-masing dari komponen tersebut memiliki tanggung jawab sebagai berikut :

1. ***Model*** : Bagian yang bertanggung jawab dengan data yang digunakan oleh aplikasi.

2. ***View*** : Bagian yang bertanggung jawab dengan tampilan pada suatu aplikasi. View bertanggung jawab terhadap semua aksi yang dilakukan oleh user, misalnya pada suatu aplikasi ada suatu button maka view lah yang menginisiasi bahwa button tersebut bisa diklik atau tidaknya.

3. ***Controller*** : Controller adalah bagian yang bertanggung jawab terhadap semua logika proses yang ada di suatu aplikasi.

$~~$ 
