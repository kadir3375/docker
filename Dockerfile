FROM nginx:latest
EXPOSE 81
CMD ["nginx", "-g", "daemon off;"]
