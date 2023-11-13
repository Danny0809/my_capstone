package com.chobo.benewproject

import com.google.gson.annotations.SerializedName

data class RegisterData (
    @SerializedName("account")
    private var account: String,

    @SerializedName("password")
    private var password: String,

    @SerializedName("name")
    private var name: String
){
    override fun toString() : String{
        return "account=$account, password=$password, name=$name"
    }
}