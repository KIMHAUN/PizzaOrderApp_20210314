package kr.co.neoplus.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.neoplus.pizzaorderapp_20210314.datas.Store
import java.util.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreDate: Store


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        mStoreDate = intent.getSerializableExtra("store") as Store

    }

}