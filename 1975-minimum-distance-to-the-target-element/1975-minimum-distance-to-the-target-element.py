class Solution(object):
    def getMinDistance(self, nums, target, start):
        midset=9999999999
        n=len(nums)
        for i in range(0,n):
            if(nums[i]==target):
                midset=min(midset,abs(i-start))
        return midset        
        