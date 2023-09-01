FROM nginx:latest
COPY nginx.conf /etc/nginx/nginx.conf
COPY default.conf /etc/nginx/conf.d/default.conf
COPY static-content /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
