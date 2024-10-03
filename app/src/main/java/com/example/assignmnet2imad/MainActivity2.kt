package com.example.assignmnet2imad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private var health = 100
    private var hunger = 50
    private var cleanliness = 100
    private var happiness = 100
    private var energy = 100
    private var hungerLevel = 100
    private var energyLevel = 100
    private lateinit var healthTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView
    private lateinit var happinessTextView: TextView
    private lateinit var energyTextView: TextView
    private lateinit var hungerLevelTextView:TextView
    private lateinit var energyLevelTextView: TextView
    private  lateinit var pet: Pet
    private  lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var petImage: ImageView

    class Pet {
        var health: Int = 0
        var hunger : Int =0
        var cleanliness : Int = 0
        var imageResource: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        pet = Pet()
        petImage = findViewById(R.id.dog)
         val feedButton: Button= findViewById(R.id.button4)
        feedButton.isClickable = true
        feedButton.isEnabled = true
         val healthTextView: TextView= findViewById(R.id.textView5)
         val hungerTextView: TextView  = findViewById(R.id.textView6)
         val cleanlinessTextView : TextView= findViewById(R.id.textView7)

        feedButton.setOnClickListener {
         fun feedPet (view: View) {
             hungerLevel -=10
             energyLevel +=10
             cleanliness -= 20
             health += 10
             hunger -= 20

             Toast.makeText(this, "Hunger: $hunger", Toast.LENGTH_SHORT).show()
             Toast.makeText(this, "Health: $health", Toast.LENGTH_SHORT).show()
             Toast.makeText(this, "Cleanliness: $cleanliness", Toast.LENGTH_SHORT).show()
             hunger = maxOf(0,hunger)
             health = minOf(100,health)


         }
            petImage.setImageResource(R.drawable.pet_feeding)
             fun updatePetStatus()  {
             val healthTextView: TextView = findViewById(R.id.health_level)
             healthTextView.text = "Health: $health"
             val hungerTextView: TextView = findViewById(R.id. hunger_level)
             hungerTextView.text = "Hunger: $hunger"
             val cleanlinessTextView: TextView = findViewById(R.id.cleanliness_level)
             cleanlinessTextView.text = "Cleanliness: $cleanliness"
             hungerLevelTextView. text = "Hunger Level: $hungerLevel"
             energyLevelTextView.text = "Energy Level : $energyLevel"


         }

        }
            val cleanButton = findViewById<Button>(R.id.button2)
            val healthTextView2: TextView = findViewById(R.id.textView6)
            val hungerTextView2: TextView = findViewById(R.id.textView5)
            val cleanlinessTextView2 :TextView = findViewById(R.id.textView7)
            cleanButton.setOnClickListener {
             fun cleanPet (view: View) {
                 cleanliness +=20
                 health +=5
                 hunger -=5
                 Toast.makeText(this, "Hunger: $hunger", Toast.LENGTH_SHORT).show()
                 Toast.makeText(this, "Health: $health", Toast.LENGTH_SHORT).show()
                 Toast.makeText(this, "Cleanliness: $cleanliness", Toast.LENGTH_SHORT).show()
                 cleanliness = minOf(cleanliness,100)
                 health = minOf(health,100)
                 hunger = maxOf(0,hunger)



             }



             petImage.setImageResource(R.drawable.pet_clean)
                fun updatePetStatus()  {
                    val healthTextView: TextView = findViewById(R.id.health_level)
                    healthTextView.text = "Health: $health"
                    val hungerTextView: TextView = findViewById(R.id. hunger_level)
                    hungerTextView.text = "Hunger: $hunger"
                    val cleanlinessTextView: TextView = findViewById(R.id.cleanliness_level)
                    cleanlinessTextView.text = "Cleanliness: $cleanliness"
                }


            }



            val playButton = findViewById<Button>(R.id.button3)
            val healthTextView3: TextView = findViewById(R.id.textView6)
            val hungerTextView4: TextView = findViewById(R.id.textView5)
            val cleanlinessTextView5 :TextView = findViewById(R.id.textView7)
            playButton.setOnClickListener {

              fun playWithPet(view: View)  {
                  happiness +=20;
                  energy -= 10
                  hunger -=5;
                  Toast.makeText(this, "Energy: $energy", Toast.LENGTH_SHORT).show()
                  Toast.makeText(this, "Happiness: $happiness", Toast.LENGTH_SHORT).show()
                  Toast.makeText(this, "Hunger: $hunger", Toast.LENGTH_SHORT).show()

                  happiness = maxOf(100,happiness)
                  energy = maxOf(0,energy)
                  hunger = maxOf(0,hunger)


              }
                petImage.setImageResource(R.drawable.pet_playing)
                 val  happinessTextView: TextView = findViewById(R.id.happiness_level)
                happinessTextView.text = "Happiness: $happiness"
                val hungerTextView : TextView = findViewById(R.id.hunger_level)
                hungerTextView.text="Hunger: $hunger"
                val energyTextView : TextView = findViewById(R.id.energy_level)
                energyTextView.text="Energy: $energy"


            }

        }
    }
