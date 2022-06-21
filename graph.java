class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> out=new ArrayList<String>();
        List<String> in=new ArrayList<String>();
        for(int i=0;i<paths.size();i++)
        {
            List<String> elements=paths.get(i);
            String outgo=elements.get(0);
            String ingo=elements.get(1);
            out.add(outgo);
            in.add(ingo);
        }
        for(int i=0;i<out.size();i++)
        {
            String ingo=in.get(i);
            if(!out.contains(ingo))
            {
                return ingo;
            }
        }
        return null;
    }
}