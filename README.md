# UAS_PrakPBO

Class Item 
Merepresentasikan item yang dapat dibeli di mall. Setiap item memiliki atribut name (nama item) dan price (harga item). Terdapat konstruktor yang digunakan untuk menginisialisasi nilai name dan price. Terdapat juga dua metode getter, yaitu getName() untuk mengembalikan nama item, dan getPrice() untuk mengembalikan harga item.

Class ShoppingCart
Digunakan untuk mengelola keranjang belanja. Keranjang belanja ini menggunakan List<Item> untuk menyimpan item yang ditambahkan. Konstruktor ShoppingCart() menginisialisasi items sebagai ArrayList. Terdapat juga metode addItem() dan removeItem() untuk menambahkan dan menghapus item dari keranjang. Metode calculateTotal() digunakan untuk menghitung total belanja berdasarkan harga item-item yang ada dalam keranjang. Terakhir, metode checkout() mencetak total belanja ke layar dan dapat diisi dengan logika pembayaran, pengurangan stok, dan lainnya.

Class Customer
Setiap pelanggan memiliki atribut cart yang merupakan objek dari kelas ShoppingCart untuk menyimpan keranjang belanja. Konstruktor Customer() digunakan untuk menginisialisasi cart. Terdapat juga metode addItemToCart() dan removeItemFromCart() untuk menambahkan dan menghapus item dari keranjang pelanggan. Metode checkout() memanggil metode checkout() dari objek cart untuk melakukan proses checkout dan pembayaran.

Class MallPurchase 
Merupakan kelas utama (entry point) program. Di dalam metode main(), beberapa objek Item dibuat sebagai contoh item-item yang dapat dibeli di mall. Kemudian, objek ShoppingCart dibuat untuk mengelola keranjang belanja. Item-item tersebut ditambahkan ke keranjang menggunakan metode addItem(). Setelah itu, dilakukan proses checkout dan penghitungan total belanja dengan memanggil metode checkout() dari objek cart. Terakhir, ditampilkan contoh penggunaan getter untuk mengakses nama dan harga dari salah satu item yang telah dibeli.
