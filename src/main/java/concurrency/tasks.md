https://leetcode.com/problems/web-crawler-multithreaded/
1242. Web Crawler Multithreaded (Medium)

Given a URL startUrl and an interface HtmlParser, 
implement a Multi-threaded web crawler to crawl all links that are under the same hostname as startUrl.
Return all URLs obtained by your web crawler in any order.

Your crawler should:
Start from the page: startUrl
Call HtmlParser.getUrls(url) to get all URLs from a webpage of a given URL.
Do not crawl the same link twice.
Explore only the links that are under the same hostname as startUrl.
