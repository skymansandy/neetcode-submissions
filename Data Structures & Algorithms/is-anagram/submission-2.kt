class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val sCounts = IntArray(26)
        val tCounts = IntArray(26)

        for(i in s.indices) {
            sCounts[s[i] - 'a']++
            tCounts[t[i] - 'a']++
        }

        return sCounts.contentEquals(tCounts)
    }
}
