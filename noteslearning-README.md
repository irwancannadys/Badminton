# Badminton
```
-Layouting : 
	- parent layout
		* RelativeLayout
			- bertumpuk dan bebas
		* LinearLayout
			- bersifat urutan/ orientation
			- harus punya orientation(vertical/horizontal)
			- default ketika LinearLayout didalam parent layout or nested layout default orientation is horizontal
		* ConstraintLayout
			- bergantungan layout satu(parent) dengan layout lainnya
	- child layout 


-Implement layout with java/MainActivity
	- Move another page(Activity)
		* Intent : suatu class yang menghandle perpindahan activity(page), intent mempunyai fitur membawa data dari activity sebelumnya ke activity selanjutnya atau sebaliknya
```

-List Feature (Home Screen Fiture)
	- we use recyclerview : 
		skeleton list yang hanya menyiapkan slot tanpa content

			-------------------
								<---- view Adapter
			-------------------
								<---- view Adapter
			-------------------
								<---- view Adapter
			-------------------
								<---- view Adapter
			-------------------
								<---- view Adapter
			-------------------
