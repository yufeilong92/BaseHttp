package com.jft.tsyc.vo

/**
 * @Author : YFL  is Creating a porject in tsyc
 * @Package com.jft.tsyc.vo
 * @Email : yufeilong92@163.com
 * @Time :2019/7/11 17:06
 * @Purpose :首页数据
 */
data class HomeDataVo(
    val banner: MutableList<Banner>?=null,
    val goods: MutableList<Good>?=null,
    val position: MutableList<Position>?=null,
    val recommend: MutableList<Recommend>?=null,
    val store: MutableList<Store>?=null
)
//商家
data class Position(
    val address: String="",
    val contact: String="",
    val detail: String="",
    val educational: String="",
    val experience: String="",
    val logo: String="",
    val name: String="",
    val salary: String=""
)
//推荐
data class Recommend(
    val image: String="",
    val name: String="",
    val note: String="",
    val types: String=""
)
//精选
data class Good(
    val commission_money: String="",
    val commission_text: String="",
    val commission_type: String="",
    val goods_id: Int=0,
    val goods_image: String="",
    val goods_jingle: String="",
    val goods_name: String="",
    val goods_price: String="",
    val goods_promotion_price: String="",
    val goods_salenum: Int=0,
    val is_commission: Int=0,
    val salenum_text: String="",
    val share_text: String="",
    val store_id: Int=0
)
//商店
data class Store(
    val address: String="",
    val category_tab: String="",
    val image: String="",
    val online_tab: String="",
    val red_tab: String="",
    val share_info: String="",
    val store_grade: Int=0,
    val store_id: Int=0,
    val store_name: String=""
)

data class Banner(
    val name: String="",
    val url: String=""
)