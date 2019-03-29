FROM ruby:2.4

RUN gem install redis-stat && redis-stat --server=63790 --auth=

EXPOSE 63790
ENTRYPOINT ["redis-stat"]