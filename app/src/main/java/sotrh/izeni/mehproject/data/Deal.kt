package sotrh.izeni.mehproject.data

import io.realm.RealmObject
import java.util.*

/**
 * Created by izeni on 7/11/16.
 */
class Deal(
        val id: String,
        val title: String,
        val features: String,
        val items: String,
        val photos: Array<String>,
        val soldOutAt: Date,
        val specifications: String,
        val story: String,
        val theme: String,
        val topic: String,
        val url: String
) : RealmObject() {

}