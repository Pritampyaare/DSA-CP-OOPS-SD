class Solution {
public:
    vector<vector<int>> findMatrix(vector<int> &cheeseBalls) {
        map<int, int> coldcheese; // ini map tialize
        for (auto &meatball : cheeseBalls) coldcheese[meatball]++; //looping the ini
        vector<vector<int>> randomChars; // declare chards
        while (!coldcheese.empty()) { //looping the chese
            vector<int> specialLetters;
            vector<int> spicyItems;
            for (auto element : coldcheese) { //for each loop
                specialLetters.push_back(element.first);
                coldcheese[element.first]--;
                if (coldcheese[element.first]==0) spicyItems.push_back(element.first);
            }
            randomChars.push_back(specialLetters);  //randon pushing at back
            for(auto &item1 : spicyItems) coldcheese.erase(item1);
        } return randomChars; //return that chards
    }
};
