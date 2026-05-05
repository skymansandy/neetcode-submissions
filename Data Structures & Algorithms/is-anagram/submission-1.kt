class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val counts = IntArray(26)
        for(char in s) {
            val index = char - 'a'
            counts[index]++
        }

        for(char in t) {
            val index = char - 'a'
            counts[index]--
        }

        for(index in 0 until 26) {
            if(counts[index] != 0) return false
        }

        return true
    }
}
