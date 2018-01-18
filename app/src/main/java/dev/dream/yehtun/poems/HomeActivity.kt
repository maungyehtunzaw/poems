package dev.dream.yehtun.poems

import android.app.Fragment
import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_home)
         val btnNavView=findViewById<BottomNavigationView>(R.id.bottomNavView)
         btnNavView.setOnNavigationItemSelectedListener {
             item:MenuItem ->
             when(item.itemId){
                 R.id.action_home_btn->{
                     supportFragmentManager.beginTransaction().replace(R.id.layoutFragement,HomeFragment()).commit()
                 }
                 R.id.action_poet_btn-> {
                     supportFragmentManager.beginTransaction().replace(R.id.layoutFragement,PoetFragment()).commit()

                 }
                 R.id.action_acc_btn-> {
                     Toast.makeText(this,"Account Implemtn",Toast.LENGTH_SHORT).show()
                 }


                 R.id.action_add_btn->{
                     Toast.makeText(this,"Add Poem Implemt",Toast.LENGTH_SHORT).show()
                 }
                 R.id.action_search_btn->{
                     Toast.makeText(this,"Search Implemnt",Toast.LENGTH_SHORT).show()
                 }
                 else->{
                     Toast.makeText(this,"Are you fucking kidding ME",Toast.LENGTH_SHORT).show()
                 }

             }
          true
         }


     }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar,menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPause() {
        super.onPause()
    }
}

