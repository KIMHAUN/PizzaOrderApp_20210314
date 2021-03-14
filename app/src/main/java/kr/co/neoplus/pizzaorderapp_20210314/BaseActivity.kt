package kr.co.neoplus.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun SetUpEvents()
    abstract fun SetValues()

}