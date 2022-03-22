
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.dancs3_1.CardViewHolder
import com.google.dancs3_1.CoffeeClicktListener
import com.google.dancs3_1.coffee
import com.google.dancs3_1.databinding.CardCellBinding

class CardAdapter(
    private val coffees: List<coffee>,
    private val clicktListener: CoffeeClicktListener

)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from ,parent,false)
        return CardViewHolder(binding , clicktListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindCoffee(coffees[position])
    }

    override fun getItemCount(): Int = coffees.size
    }


