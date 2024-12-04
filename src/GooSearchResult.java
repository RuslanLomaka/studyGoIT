class GooSearchResult {
    private String url;

    public String getUrl() {
        return url;
    }


    public GooSearchResult(String url) {
        this.url = url;
    }

    public String parseDomain(){
       url = url.substring(url.indexOf("//")+2);//offsetting https://

        if(url.lastIndexOf('/')==-1){
            return url;
        }
        url = url.substring(0, url.lastIndexOf('/'));

        return url;

    }

}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://office.com/?q=123").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}