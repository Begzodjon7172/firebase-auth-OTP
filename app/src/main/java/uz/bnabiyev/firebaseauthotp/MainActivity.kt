package uz.bnabiyev.firebaseauthotp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import uz.bnabiyev.firebaseauthotp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        binding.signOutBtn.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, PhoneActivity::class.java))
        }


    }
}