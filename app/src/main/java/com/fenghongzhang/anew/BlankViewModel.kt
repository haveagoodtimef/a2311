package com.fenghongzhang.anew

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

//java  koltin
class BlankViewModel : ViewModel() {
   // 1
  //后端取了20个字段  操作符.rxjava . livedata (全) kotlin -> flow
    fun test(){
        viewModelScope.launch {

        }
    }

}