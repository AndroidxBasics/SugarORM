package com.mychatapp.lubuntupc.sugartest

import com.orm.SugarRecord



/**
 * Created by lubuntupc on 18.12.17.
 */
class Book(var title: String) : SugarRecord() {
        constructor() :this("") {

        }




}



/*

class Book : SugarRecord() {
    var title: String? = null

}

 */